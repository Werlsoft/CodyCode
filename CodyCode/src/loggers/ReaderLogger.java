package loggers;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import enums.DisplayType;
import enums.LoggingLevel;


public class ReaderLogger extends Reader implements Logger{

	protected LoggingLevel defaultLevel = LoggingLevel.INFO; //default level is INFO
	protected DisplayType displayType = DisplayType.CONCISE; //default display type is CONCISE
	protected String format = ""; //1 for time, 2 for level, 3 for message
	protected final InputStreamReader inRead;
	protected final Logger logger;
	
	public ReaderLogger(InputStreamReader in,Logger logger){
		inRead = in;
		this.logger = logger;
		defaultLevel = logger.getDefaultLevel();
		displayType = logger.getDisplayType();
		format = logger.getFormat();
	}
	
	public ReaderLogger(Logger logger){
		this(new InputStreamReader(System.in),logger);
	}
	
	@Override
	public void log(Object message) {
		this.log(message, defaultLevel);
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		logger.log(message,level);
	}

	@Override
	public void charLog(char c) {
		// TODO Auto-generated method stub
		
	}	
	
	@Override
	public void setFormat(String format) {
		this.format = format;
		logger.setFormat(format);
	}

	@Override
	public String getFormat() {
		return format;
	}

	@Override
	public void setDefaultLevel(LoggingLevel level) {
		defaultLevel = level;
		logger.setDefaultLevel(level);
	}

	@Override
	public LoggingLevel getDefaultLevel() {
		return defaultLevel;
	}

	@Override
	public void setDisplayType(DisplayType displayType) {
		this.displayType = displayType;
		logger.setDisplayType(displayType);
	}

	@Override
	public DisplayType getDisplayType() {
		return displayType;
	}

	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		return inRead.read(cbuf, off, len);
	}

	@Override
	public void close() throws IOException {
		inRead.close();
	}
	
}
