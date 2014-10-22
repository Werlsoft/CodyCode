package util;

import java.io.IOException;
import java.io.Writer;

import interfaces.Logger;

public class LoggingWriter extends Writer {
	
	protected final Logger logger;
	protected final boolean autoFlush;
	
	public LoggingWriter(Logger logger){
		this(logger, false);
	}
	
	public LoggingWriter(Logger logger, Boolean autoFlush){
		this.logger = logger;
		this.autoFlush = autoFlush;
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		for(int i = off;i < off+len; i++){
			System.out.print(cbuf[i]);
		}
	}

	@Override
	public void flush() throws IOException{
		
	}

	@Override
	public void close() throws IOException{
		
	}
}
