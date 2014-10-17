package loggers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import enums.DisplayType;
import enums.LoggingLevel;

public class FileLogger implements Logger{
	
	protected LoggingLevel defaultLevel = LoggingLevel.INFO; //default level is INFO
	protected DisplayType displayType = DisplayType.CONCISE; //default display type is CONCISE
	protected String format = "%1$s-%2$s: %3$s\n"; //1 for time, 2 for level, 3 for message
	/**
	 * When this is true this means that the FileLogger is ready to write to files. If you use the log() method while this is false input will be ignored.
	 */
	public boolean ready = false;
	protected PrintStream output = null;
	/**
	 * 
	 * @param file The target file to write log output to.
	 * 
	 * <p>When this constructor is run the value of 'ready' should be true unless there was errors attaching to the file.</p>
	 * <p>This will OVERWRITE the file used!</p>
	 */
	public FileLogger(File file){
		this(file,false);
	}
	
	/**
	 * 
	 * @param file the Target file to write log output to.
	 * @param append When set to true the target file will not be overwritten.
	 * 
	 * <p>When this constructor is run the value of 'ready' should be true unless there was errors attaching to the file.</p>
	 */
	public FileLogger(File file,boolean append){
		try {
			output = new PrintStream(new FileOutputStream(file,append));
			ready = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * <p>This will use the default file "FileLoggerOutput.log"</p>
	 * <p>When this constructor is run the value of 'ready' should be true unless there was errors attaching to the file.</p>
	 * <p>This will OVERWRITE the file used!</p>
	 */
	public FileLogger(){
		this(false);
	}
	
	/**
	 * 
	 * @param append When set to true the target file will not be overwritten.
	 * 
	 * <p>This will use the default file "FileLoggerOutput.log"</p>
	 * <p>When this constructor is run the value of 'ready' should be true unless there was errors attaching to the file.</p>
	 * 
	 */
	public FileLogger(boolean append){
		this(new File("FileLoggerOutput.log"),append);
	}
	
	@Override
	public void log(Object message) {
		this.log(message,defaultLevel);
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		if(ready)
			output.printf(format,"TimeStamp",LoggingLevel.convert(level, displayType),message);
	}

	@Override
	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String getFormat() {
		return format;
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
	public Logger getLogger() {
		return this;
	}
	
	
	
}
