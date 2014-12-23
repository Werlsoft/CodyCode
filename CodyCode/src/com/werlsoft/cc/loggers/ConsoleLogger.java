package com.werlsoft.cc.loggers;

import java.io.PrintStream;

import com.werlsoft.cc.abstracts.BaseLogger;
import com.werlsoft.cc.enums.LoggingLevel;
import com.werlsoft.cc.util.StringTool;

public class ConsoleLogger extends BaseLogger {
	
	protected final PrintStream output = System.out; //Hard wired to System.out because its a console logger

	@Override
	public void log(Object message, LoggingLevel level) {
		if(RTL)
			message = StringTool.reverse(message.toString());
		output.printf(format, "Time Mark",LoggingLevel.convert(level, displayType),message);
	}

}
