package com.werlsoft.cc.enums;

public enum DisplayType {
	/**
	 * Used for full length names.
	 */
FULL,		//Full long words
	/**
	 * Used for the shortest most readable name. Normally best.
	 */
CONCISE,	//Best fit for most cases
	/**
	 * 4 digit short codes. Best for consistent output.
	 */
SHORT,		//4 letter short codes
	/**
	 * No changes to input.
	 */
UNMODIFIED 	//Will not change anything
}
