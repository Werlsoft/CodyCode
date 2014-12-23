package com.werlsoft.codycode.loggers;

import java.io.PrintStream;

import com.werlsoft.codycode.abstracts.BaseLogger;
import com.werlsoft.codycode.enums.LoggingLevel;
import com.werlsoft.codycode.util.StringTool;

public class ConsoleLogger extends BaseLogger {
	
	protected final PrintStream output = System.out; //Hard wired to System.out because its a console logger

	@Override
	public void log(Object message, LoggingLevel level) {
		if(RTL)
			message = StringTool.reverse(message.toString());
		output.printf(format, "Time Mark",LoggingLevel.convert(level, displayType),message);
	}

}
