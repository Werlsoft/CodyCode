package util;

import interfaces.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;


public class LoggingReader extends Reader{

	protected final Reader inRead;
	protected final Logger logger;
	
	public LoggingReader(Reader in,Logger logger){
		inRead = in;
		this.logger = logger;
	}
	
	public Logger getLogger() {
		return logger;
	}
	
	public Reader getReader(){
		return this;
	}
	
	@Override
	public int read() throws IOException{
		int data = inRead.read();
		this.logger.charLog((char) data); //see what I did there?
		return data;
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
