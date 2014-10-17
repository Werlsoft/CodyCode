package loggers;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import enums.DisplayType;
import enums.LoggingLevel;


public class LogggingReader extends Reader{

	protected final InputStreamReader inRead;
	protected final Logger logger;
	
	public LogggingReader(InputStreamReader in,Logger logger){
		inRead = in;
		this.logger = logger;
	}
	
	public LogggingReader(Logger logger){
		this(new InputStreamReader(System.in),logger);
	}
	
	public Logger getLogger() {
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
