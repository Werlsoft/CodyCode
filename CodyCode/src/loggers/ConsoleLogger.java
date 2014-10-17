package loggers;

import java.io.PrintStream;

import abstracts.BaseLogger;
import enums.LoggingLevel;

public class ConsoleLogger extends BaseLogger {
	
	protected final PrintStream output = System.out; //Hard wired to System.out because its a console logger

	@Override
	public void log(Object message, LoggingLevel level) {
		output.printf(format, "Time Mark",LoggingLevel.convert(level, displayType),message);
	}

}
