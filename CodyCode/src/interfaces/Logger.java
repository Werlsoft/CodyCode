package interfaces;

import enums.DisplayType;
import enums.LoggingLevel;

public interface Logger {
	/**
	 * 
	 * @param message The information to display
	 * 
	 * <p>Used to send Strings to all outputs connected to the {@link BaseLogger} this method is run on. This method uses the Default level set using the setDefaultLevel method.</p>
	 * <p> For example <br/>
	 * '<code>new ConsoleLogger().log("Hello World",LoggingLevel.INFO);</code>'<br/>
	 * would print '<code>TimeStamp-INFO: Hello World</code>' to the console ({@link ConsoleLogger} attaches to System.out automatically)
	 * 
	 */
	public void log(Object message);
	/**
	 * 
	 * @param message The information to display
	 * @param level The level to display when logging message
	 * 
	 * <p>Used to send Strings to all outputs connected to the {@link BaseLogger} this method is run on.</p>
	 * <p> For example <br/>
	 * '<code>new ConsoleLogger().log("Hello World",LoggingLevel.INFO);</code>'<br/>
	 * would print '<code>TimeStamp-INFO: Hello World</code>' to the console ({@link ConsoleLogger} attaches to System.out automatically)
	 * 
	 */
	public void log(Object message,LoggingLevel level);
	/**
	 * 
	 * @param c character to add to buffer
	 * 
	 * Allows a character input. Will log when a '\n' character is received.
	 */
	public void charLog(char c);
	/**
	 * 
	 * @param format
	 * 
	 * <p>Used to format the output of the {@link BaseLogger} to all outputs.</p><br/>
	 * <ul><h5>These codes are replaced with the listed attribute</h5>
	 * 	<li>'<code>%1$s</code>' - TimeStamp</li>
	 * 	<li>'<code>%2$s</code>' - LoggingLevel</li>
	 * 	<li>'<code>%3$s</code>' - Message</li>
	 * </ul>
	 */
	public void setFormat(String format);
	/**
	 * 
	 * @return
	 * 
	 * <p>Returns a string representing the format used for logging.</p>
	 */
	public String getFormat();
	/**
	 * 
	 * @param level
	 * 
	 * <p>Sets the default level as used in the log(Object message) method</p>
	 */
	public void setDefaultLevel(LoggingLevel level);
	/**
	 * 
	 * @return
	 * 
	 * <p>Returns the default level as used in the log(Object message) method.</p>
	 * 
	 */
	public LoggingLevel getDefaultLevel();
	/**
	 * 
	 * @param displayType
	 * 
	 * <p>Set the display type. This is used for automatic formatting of levels to create a consistent appearance regardless of the specific LoggingLevel used.</p>
	 * <ul><h5>Effects</h5>
	 * <li>FULL - will use the longest most explanatory name possible.</li>
	 * <li>SHORT - will use only 4 digit short codes in the output. Good for a more constant appearance.</li>
	 * <li>CONCISE - will use the shortest readable name possible. Normally the best choice.</li>
	 * <li>UNMODIFIED - will use exactly the same level name as put in. Only use if you must need to use equivalent names for different purposes.</li>
	 * </ul>
	 */
	public void setDisplayType(DisplayType displayType);
	/**
	 * 
	 * @return
	 * 
	 * <p>Returns the currently active display type.</p>
	 */
	public DisplayType getDisplayType();
	public void setRTL(boolean rtl);
	public boolean getRTL();
	/**
	 * 
	 * @return
	 */
	public Logger getLogger();
	
}
