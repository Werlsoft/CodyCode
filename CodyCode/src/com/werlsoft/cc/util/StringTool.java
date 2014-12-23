package com.werlsoft.cc.util;

public class StringTool {

	public static String reverse(String str) {
		String out = new String();
		for(int i = str.length()-1; i >= 0;i--){
			out += str.substring(i, i+1);
		}
		return out;
	}
}
