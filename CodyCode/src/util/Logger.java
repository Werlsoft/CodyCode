package util;

import enums.DisplayType;
import enums.LoggingLevel;

public interface Logger {
	
	void log(Object message);
	void log(Object message,LoggingLevel level);
	void setFormat(String format);
	String getFormat();
	void setDefaultLevel(LoggingLevel level);
	LoggingLevel getDefaultLevel();
	void setDisplayType(DisplayType displayType);
	DisplayType getDisplayType();
}
