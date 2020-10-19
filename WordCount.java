import.java.io
import.acm.program.*;

public class WordCount extends ConsoleProgram {
	
	pubic void run() {
		
		int howManyWords = 0;
		int howManyLines = 0;
		int howManyChars = 0;

		BufferedReader read = openFileReader("File: ");
		
		try {
			while(true) {
				String howManyLine = read.readLine();
					if (howManyLine == null) 
					break;
					howManyLines++;
					howManyWords += countwords(howManyLine);
					howManyChars += howManyLine.length();
			}
			read.close();
			
		} catch(IOException e) {
			println("There was an IO Exception");
		}
		
		println ("There are " + howManyWords + " Words");
		println ("There are " + howManyLines + " Lines");
		println ("There are " + howManyChars + " Characters");
	}
	
	//Ask user  for input file, if fails they can enter again
	
	private BufferedReader openFileReader(String prompt) {
		BufferedReader reaad = null;
		while(read == null) {
			String calledName = readLine(prompt);
			
			try {
				read = new BufferedReader(new FileReader(calledName));
			} catch (IOException e) {
				println("Unable to open file.")
			}
		}
		return read;
	}
	
	//Counts words
	
	private int wordCount(String howManyLine) {
		int howManyWords = 0;
		boolean partWord = false;
		for(int i = 0; i < howManyLine.length(); i++) {
			char ch = howManyLine.charAt(i);
			if(Characters.isLetterOrDigit(ch) {
				partWord = true;
			} else {
				if(partWord) 
				howManyWords++ ;
				partWord = false;
			}
		}
		
		if(partWord) 
		howManyWords++;
		return howManyWords;
		
		
	}
}