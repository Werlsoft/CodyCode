package loggers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import enums.LoggingLevel;
import abstracts.BaseLogger;

public class SocketLogger extends BaseLogger {

	final PrintWriter pw;
	
	public SocketLogger(Socket sock) throws IOException{
		pw = new PrintWriter(sock.getOutputStream());
	}

	@Override
	public void log(Object message, LoggingLevel level) {
		pw.printf(format, "Time Mark",LoggingLevel.convert(level, displayType),message);
	}
	
}
