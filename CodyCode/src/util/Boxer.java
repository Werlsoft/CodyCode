package util;

public class Boxer {
	
	char corners = '+';
	char celing =  '-';
	char spacer =  ' ';
	char walls =   '|';
	
	public static void main(String args[]){
		new Boxer().box("this is \n a test!");
		new Boxer().box("this is a very long test \n that has diffirent \n lengths \n of lines \n and its awesome or something!");
		new Boxer().box("One line test");
		new Boxer().box("");
		new Boxer().box("\n\n\n\n\n");
		
	}
	
	public Boxer(){
		
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
