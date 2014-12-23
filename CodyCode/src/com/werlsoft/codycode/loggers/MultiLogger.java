package com.werlsoft.codycode.loggers;

import com.werlsoft.codycode.abstracts.BaseLogger;
import com.werlsoft.codycode.enums.DisplayType;
import com.werlsoft.codycode.enums.LoggingLevel;
import com.werlsoft.codycode.interfaces.Logger;

public class MultiLogger extends BaseLogger {
	
	protected final Logger[] loggers;
	
	
	public MultiLogger(Logger... loggers){
		this.loggers = loggers;
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		for(Logger l:loggers)
			l.log(message, level);
	}

	@Override
	public void charLog(char c) {
		for(Logger l:loggers)
			l.charLog(c);
	}

	@Override
	public void setFormat(String format) {
		super.setFormat(format);
		for(Logger l:loggers)
			l.setFormat(this.format);
	}

	@Override
	public void setDefaultLevel(LoggingLevel level) {
		super.setDefaultLevel(level);
		for(Logger l:loggers)
			l.setDefaultLevel(this.defaultLevel);
	}

	@Override
	public void setDisplayType(DisplayType displayType) {
		super.setDisplayType(displayType);
		for(Logger l:loggers)
			l.setDisplayType(this.displayType);
	}
	
	@Override
	public void setRTL(boolean RTL){
		super.setRTL(RTL);
		for(Logger l:loggers)
			l.setRTL(RTL);
	}

}
