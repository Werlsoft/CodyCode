package com.werlsoft.codycode.enums;

public enum LoggingLevel {
//Status
	INFO, //4 LETTER SHORT CONCISE
	INFORMATION, //FULL
	WARN, //4 LETTER SHORT CONCISE
	WARNING, //FULL CONCISE
	ERRR, //4 LETTER SHORT
	ERROR, //FULL CONCISE
	SEVR, //4 LETTER SHORT
	SEVERE, //FULL CONCISE
	FATL, //4 LETTER SHORT
	FATAL, //FULL CONCISE
	CRSH, //4 LETTER SHORT
	CRASH, //FULL CONCISE
//Debug
	DEBG, //4 LETTER SHORT
	DEBUG, //FULL CONCISE
	TRCE, //4 LETTER SHORT
	TRACE, //CONCISE
	STACKTRACE, //FULL
	VERB, //4 LETTER SHORT
	VERBOSE, //FULL CONCISE
//Messages
	CLMS, //4 LETTER SHORT
	CLIENT, //CONCISE
	CLIENTMESSAGE, //FULL
	ADMS, //4 LETTER SHORT
	ADMINISTRATOR, //CONCISE
	ADMINISTRATORMESSAGE, //FULL
	CHAT, //4 LETTER SHORT CONCISE
	CHATMESSAGE, //FULL
	MESG, //4 LETTER SHORT
	MESSAGE, //FULL CONCISE
	TRAN, //4 LETTER SHORT
	TRANSMISSION, //FULL CONCISE
	BRCS, //4 LETTER SHORT
	BROADCAST,  // FULL CONCISE
	SERL, //4 LETTER SHORT
	SERIAL,  //FULL CONCISE
	UPDT, //4 LETTER SHORT
	UPDATE,  //FULL CONCISE
	CONT, //4 LETTER SHORT
	CONTINUE, //CONCISE
	CONTINUATION, //FULL
//SPECIAL
	INTR, //4 LETTER SHORT
	INTERNAL;  //FULL CONCISE
	
	/**
	 * 
	 * @param orig LoggingLevel to covert
	 * @param target Target DisplayType to use
	 * @return Converted LoggingLevel
	 * 
	 * <p>Will return the converted LoggingLevel based on the given DisplayType</p>
	 * <ul><h5>DisplayType conversions</h5>
	 * <li>FULL - will use the longest most explanatory name possible.</li>
	 * <li>SHORT - will use only 4 digit short codes in the output. Good for a more constant appearance.</li>
	 * <li>CONCISE - will use the shortest readable name possible. Normally the best choice.</li>
	 * <li>UNMODIFIED - will use exactly the same level name as put in. Only use if you must need to use equivalent names for different purposes.</li>
	 * </ul>
	 */
	public static LoggingLevel convert(LoggingLevel orig,DisplayType target){
		switch(target){
		case FULL:
			return convertUp(orig);
		case CONCISE:
			return convertConcise(orig);
		case SHORT:
			return convertDown(orig);
		default:
			return orig;
		}
	}
	
	/**
	 * 
	 * @param orig LoggingLevel to be converted
	 * @return Converted LoggingLevel
	 * 
	 * <p>Convents input LoggingLevel to the 4 letter short code</p>
	 */
	public static LoggingLevel convertDown(LoggingLevel orig){
		
		/*
		 * Converts LoggingLevel to the 4 letter short code for each level.
		 */
		
		switch(orig){
		case INFORMATION:
		case INFO:
			return INFO;
		case WARNING:
		case WARN:
			return WARN;
		case ERROR:
		case ERRR:
			return ERRR;
		case SEVERE:
		case SEVR:
			return SEVR;
		case FATAL:
		case FATL:
			return FATL;
		case CRASH:
		case CRSH:
			return CRSH;
		case DEBUG:
		case DEBG:
			return DEBG;
		case STACKTRACE: 
		case TRACE:
		case TRCE:
			return TRCE;
		case VERBOSE:
		case VERB:
			return VERB;
		case CLIENTMESSAGE:
		case CLIENT:
		case CLMS:
			return CLMS;
		case ADMINISTRATORMESSAGE: 
		case ADMINISTRATOR:
		case ADMS:
			return ADMS;
		case CHATMESSAGE:
		case CHAT:
			return CHAT;
		case MESSAGE:
		case MESG:
			return MESG;
		case TRANSMISSION:
		case TRAN:
			return TRAN;
		case BROADCAST:
		case BRCS:
			return BRCS;
		case SERIAL:
		case SERL:
			return SERL;
		case UPDATE:
		case UPDT:
			return UPDT;
		case CONTINUATION:
		case CONTINUE:
		case CONT:
			return CONT;
		case INTERNAL:
		case INTR:
			return INTR;
		default:
			return orig;
		}
	}
	
	
	/**
	 * 
	 * @param orig LoggingLevel to convert
	 * @return Converted LoggingLevel
	 * 
	 * <p>Returns the longest name for the input LoggingLevel</p>
	 */
	public static LoggingLevel convertUp(LoggingLevel orig){
		
		/*
		 * Converts LoggingLevel to the full level name
		 */
		
		switch(orig){
		case INFORMATION:
		case INFO:
			return INFORMATION;
		case WARNING:
		case WARN:
			return WARNING;
		case ERROR:
		case ERRR:
			return ERROR;
		case SEVERE:
		case SEVR:
			return SEVERE;
		case FATAL:
		case FATL:
			return FATAL;
		case CRASH:
		case CRSH:
			return CRASH;
		case DEBUG:
		case DEBG:
			return DEBUG;
		case STACKTRACE: 
		case TRACE:
		case TRCE:
			return STACKTRACE;
		case VERBOSE:
		case VERB:
			return VERBOSE;
		case CLIENTMESSAGE:
		case CLIENT:
		case CLMS:
			return CLIENTMESSAGE;
		case ADMINISTRATORMESSAGE: 
		case ADMINISTRATOR:
		case ADMS:
			return ADMINISTRATORMESSAGE;
		case CHATMESSAGE:
		case CHAT:
			return CHATMESSAGE;
		case MESSAGE:
		case MESG:
			return MESSAGE;
		case TRANSMISSION:
		case TRAN:
			return TRANSMISSION;
		case BROADCAST:
		case BRCS:
			return BROADCAST;
		case SERIAL:
		case SERL:
			return SERIAL;
		case UPDATE:
		case UPDT:
			return UPDATE;
		case CONTINUATION:
		case CONTINUE:
		case CONT:
			return CONTINUATION;
		case INTERNAL:
		case INTR:
			return INTERNAL;
		default:
			return orig;
		}
	}
	
	/**
	 * 
	 * @param orig LoggingLevel to convert
	 * @return Converted LoggingLevel
	 * 
	 * <p>Returns the most Concise name for the input LoggingLevel</p>
	 * 
	 */
	public static LoggingLevel convertConcise(LoggingLevel orig){
		
		/*
		 * Converts LoggingLevel to the proper concise version.
		 */
		
		switch(orig){
		case INFORMATION:
		case INFO:
			return INFO;
		case WARNING:
		case WARN:
			return WARN;
		case ERROR:
		case ERRR:
			return ERROR;
		case SEVERE:
		case SEVR:
			return SEVERE;
		case FATAL:
		case FATL:
			return FATAL;
		case CRASH:
		case CRSH:
			return CRASH;
		case DEBUG:
		case DEBG:
			return DEBUG;
		case STACKTRACE: 
		case TRACE:
		case TRCE:
			return TRACE;
		case VERBOSE:
		case VERB:
			return VERBOSE;
		case CLIENTMESSAGE:
		case CLIENT:
		case CLMS:
			return CLIENT;
		case ADMINISTRATORMESSAGE: 
		case ADMINISTRATOR:
		case ADMS:
			return ADMINISTRATOR;
		case CHATMESSAGE:
		case CHAT:
			return CHAT;
		case MESSAGE:
		case MESG:
			return MESSAGE;
		case TRANSMISSION:
		case TRAN:
			return TRANSMISSION;
		case BROADCAST:
		case BRCS:
			return BROADCAST;
		case SERIAL:
		case SERL:
			return SERIAL;
		case UPDATE:
		case UPDT:
			return UPDATE;
		case CONTINUATION:
		case CONTINUE:
		case CONT:
			return CONTINUE;
		case INTERNAL:
		case INTR:
			return INTERNAL;
		default:
			return orig;
		}
	}
}
