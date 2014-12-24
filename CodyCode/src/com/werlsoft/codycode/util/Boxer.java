package com.werlsoft.codycode.util;

public class Boxer {
	
	public static char DefaultCorners = '╬';
	public static char AltCorners = '+';
	public static char DefaultCeling = '=';
	public static char AltCeling = '-';
	public static char DefaultSpacer = ' ';
	public static char AltSpacer = ' ';
	public static char DefaultWalls = '‖';
	public static char AltWalls = '|';
	
	final char corners;
	final char celing;
	final char spacer;
	final char walls;
	
	public Boxer(){
		this(false);
		//TODO add set method or such.
	}
	
	public Boxer(boolean alt){
		if(alt){
			this.corners = AltCorners;
			this.celing = AltCeling;
			this.spacer = AltSpacer;
			this.walls = AltWalls;
		} else {
			this.corners = DefaultCorners;
			this.celing = DefaultCeling;
			this.spacer = DefaultSpacer;
			this.walls = DefaultWalls;
		}
	}
	
	public Boxer(char corner, char celing, char spacer, char wall){
		this.corners = corner;
		this.celing = celing;
		this.spacer = spacer;
		this.walls = wall;
	}

	public void box(String toBox){
		String in = addSpace(toBox);
		int longest = 0;
		for(String s: in.split("\n"))
			if(longest < s.length())
				longest = s.length();
		int length = longest + 6;			//TODO account for tab (\t) characters.
		int lines = in.split("\n").length + 2;
		for (int line = 0; line < lines; line++){
			if((line == 0) || (line == lines-1))
				for (int pos = 0; pos < length; pos++)
					if(pos == 0 || pos == length-1)
						System.out.print(corners);
					else
						System.out.print(celing);
			else
				for (int pos = 0; pos < length; pos++)
					if(pos == 0 || pos == length-1)
						System.out.print(walls);
					else if(in.split("\n")[line-1].toCharArray().length < pos-2 || pos < 3 || pos+3 >= length)
						System.out.print(spacer);
					else
						System.out.print(in.split("\n")[line-1].toCharArray()[pos-3]);
			System.out.println();
		}
	}
	
	private String addSpace(String str){
		if(str.matches("")){
			str += ' ';
		}
		str = str.replace('\t', ' '); //TODO remove this!
		String[] string = str.split("\n");
		String output = new String();
			for(String s: string){
				if(s.toCharArray()[0] == ' '){
					char[] newString = new char[s.toCharArray().length-1];
					for(int i = 1; i < s.toCharArray().length; i++){
						newString[i-1] = s.toCharArray()[i];
					}
					output += new String(newString);
				}
				else
					output += s;
				output += '\n';
			}
		return output;
	}
	
}
