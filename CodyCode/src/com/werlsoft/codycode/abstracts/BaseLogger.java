package com.werlsoft.codycode.abstracts;


import com.werlsoft.codycode.enums.DisplayType;
import com.werlsoft.codycode.enums.LoggingLevel;
import com.werlsoft.codycode.interfaces.Logger;

public abstract class //BaseLogger implements Logger {
	
	protected LoggingLevel defaultLevel = LoggingLevel.INFO; //default level is INFO
	protected DisplayType displayType = DisplayType.CONCISE; //default display type is CONCISE
	protected String format = "%1$s-%2$s: %3$s\n"; //1 for time, 2 for level, 3 for message
	protected boolean RTL = false;
	public char[] chars = new char[0];
	
	public void log(Object message){
		this.log(message, defaultLevel);
	}
	
	abstract public void log(Object message,LoggingLevel level);
	
	public void charLog(char c){
		if(c == '\n'){
			this.log(new String(chars));
			chars = new char[0];
		}
		else{
		char[] old = chars.clone();
		chars = new char[old.length + 1];
		for(int i = 0; i < old.length; i++){
			chars[i] = old[i];
		}
		chars[old.length] = c;
		}
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
	
	public void setRTL(boolean RTL){
		this.RTL = RTL;
	}
	
	public boolean getRTL(){
		return RTL;
	}
	
	public Logger getLogger(){
		return this;
	}
}
