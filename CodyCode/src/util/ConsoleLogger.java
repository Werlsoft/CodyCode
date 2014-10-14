package util;

import java.io.PrintStream;

import enums.DisplayType;
import enums.LoggingLevel;

public class ConsoleLogger implements Logger {
	
	protected LoggingLevel defaultLevel = LoggingLevel.INFO;
	protected DisplayType displayType = DisplayType.CONCISE;
	protected String format = "%1$s-%2$s: %3$s"; //1 for time, 2 for level, 3 for message
	protected PrintStream output = System.out;
	
	@Override
	public void log(Object message) {
		this.log(message, defaultLevel);
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		output.printf(format + "\n", "Time Mark",LoggingLevel.convert(level, displayType),message);
	}
	
	@Override
	public void setDefaultLevel(LoggingLevel level) {
		defaultLevel = level;
	}

	@Override
	public LoggingLevel getDefaultLevel() {
		return defaultLevel;
	}

	@Override
	public void setDisplayType(DisplayType displayType) {
		this.displayType = displayType;
	}

	@Override
	public DisplayType getDisplayType() {
		return displayType;
	}

	@Override
	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String getFormat() {
		return format;
	}


}
