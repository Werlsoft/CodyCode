package util;

import enums.DisplayType;
import enums.LoggingLevel;

public interface Logger {
	
	/**
	 * 
	 * @param message The information to display
	 * 
	 * <p>Used to send Strings to all outputs connected to the {@link Logger} this method is run on.</p>
	 * <p> For example <br/>
	 * '<code>new ConsoleLogger().log("Hello World",LoggingLevel.INFO);</code>'<br/>
	 * would print '<code>TimeStamp-INFO: Hello World</code>' to the console ({@link ConsoleLogger} attaches to System.out automatically)
	 * 
	 */
	void log(Object message);
	/**
	 * 
	 * @param message The information to display
	 * @param level The level to display when logging message
	 * 
	 * <p>Used to send Strings to all outputs connected to the {@link Logger} this method is run on.</p>
	 * <p> For example <br/>
	 * '<code>new ConsoleLogger().log("Hello World",LoggingLevel.INFO);</code>'<br/>
	 * would print '<code>TimeStamp-INFO: Hello World</code>' to the console ({@link ConsoleLogger} attaches to System.out automatically)
	 * 
	 */
	void log(Object message,LoggingLevel level);
	void setFormat(String format);
	String getFormat();
	void setDefaultLevel(LoggingLevel level);
	LoggingLevel getDefaultLevel();
	void setDisplayType(DisplayType displayType);
	DisplayType getDisplayType();
}
