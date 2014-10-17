package loggers;

import enums.DisplayType;
import enums.LoggingLevel;

public class MultiLogger implements Logger {

	protected LoggingLevel defaultLevel = LoggingLevel.INFO; //default level is INFO
	protected DisplayType displayType = DisplayType.CONCISE; //default display type is CONCISE
	protected String format = "%1$s-%2$s: %3$s"; //1 for time, 2 for level, 3 for message
	protected final Logger[] loggers;
	
	
	public MultiLogger(Logger... loggers){
		this.loggers = loggers;
	}
	
	@Override
	public void log(Object message) {
		this.log(message,defaultLevel);
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		for(Logger l:loggers)
			l.log(message, level);
	}

	@Override
	public void setFormat(String format) {
		this.format = format;
		for(Logger l:loggers)
			l.setFormat(format);
	}

	@Override
	public String getFormat() {
		return format;
	}

	@Override
	public void setDefaultLevel(LoggingLevel level) {
		defaultLevel = level;
		for(Logger l:loggers)
			l.setDefaultLevel(level);
	}

	@Override
	public LoggingLevel getDefaultLevel() {
		return defaultLevel;
	}

	@Override
	public void setDisplayType(DisplayType displayType) {
		this.displayType = displayType;
		for(Logger l:loggers)
			l.setDisplayType(displayType);
	}

	@Override
	public DisplayType getDisplayType() {
		return displayType;
	}

	@Override
	public Logger getLogger() {
		return this;
	}

}
