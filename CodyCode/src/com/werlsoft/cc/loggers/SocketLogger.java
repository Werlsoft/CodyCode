package com.werlsoft.cc.loggers;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import com.werlsoft.cc.abstracts.BaseLogger;
import com.werlsoft.cc.enums.LoggingLevel;

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
