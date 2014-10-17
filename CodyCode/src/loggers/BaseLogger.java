package loggers;

import interfaces.Logger;
import enums.DisplayType;
import enums.LoggingLevel;

public abstract class BaseLogger implements Logger {
	
	protected LoggingLevel defaultLevel = LoggingLevel.INFO; //default level is INFO
	protected DisplayType displayType = DisplayType.CONCISE; //default display type is CONCISE
	protected String format = "%1$s-%2$s: %3$s\n"; //1 for time, 2 for level, 3 for message
	
	public void log(Object message){
		this.log(message, defaultLevel);
	}
	
	abstract public void log(Object message,LoggingLevel level);
	
	public void charLog(char c){
		//TODO make this
	}
	
	public void setFormat(String format){
		this.format = format;
	}
	
	public String getFormat(){
		return this.format;
	}
	
	public void setDefaultLevel(LoggingLevel level){
		this.defaultLevel = level;
	}
	
	public LoggingLevel getDefaultLevel(){
		return this.defaultLevel;
	}
	
	public void setDisplayType(DisplayType displayType){
		this.displayType = displayType;
	}
	
	public DisplayType getDisplayType(){
		return this.displayType;
	}
	
	public Logger getLogger(){
		return this;
	}
}
