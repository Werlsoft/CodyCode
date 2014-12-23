package com.werlsoft.codycode.loggers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import com.werlsoft.codycode.abstracts.BaseLogger;
import com.werlsoft.codycode.enums.LoggingLevel;

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
