package loggers;

import enums.DisplayType;
import enums.LoggingLevel;

public class MultiLogger extends BaseLogger {
	
	protected final BaseLogger[] loggers;
	
	
	public MultiLogger(BaseLogger... loggers){
		this.loggers = loggers;
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		for(BaseLogger l:loggers)
			l.log(message, level);
	}

	@Override
	public void charLog(char c) {
		for(BaseLogger l:loggers)
			l.charLog(c);
	}

	@Override
	public void setFormat(String format) {
		super.setFormat(format);
		for(BaseLogger l:loggers)
			l.setFormat(this.format);
	}

	@Override
	public void setDefaultLevel(LoggingLevel level) {
		super.setDefaultLevel(level);
		for(BaseLogger l:loggers)
			l.setDefaultLevel(this.defaultLevel);
	}

	@Override
	public void setDisplayType(DisplayType displayType) {
		super.setDisplayType(displayType);
		for(BaseLogger l:loggers)
			l.setDisplayType(this.displayType);
	}

}
