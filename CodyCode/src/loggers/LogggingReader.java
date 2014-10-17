package loggers;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class LogggingReader extends Reader{

	protected final InputStreamReader inRead;
	protected final BaseLogger logger;
	
	public LogggingReader(InputStreamReader in,BaseLogger logger){
		inRead = in;
		this.logger = logger;
	}
	
	public LogggingReader(BaseLogger logger){
		this(new InputStreamReader(System.in),logger);
	}
	
	public BaseLogger getLogger() {
		return logger;
	}
	
	public Reader getReader(){
		return this;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int data = inRead.read(cbuf, off, len);
		this.logger.charLog((char) data); //see what I did there?
		return data;
	}

	@Override
	public void close() throws IOException {
		inRead.close();
	}
	
}
