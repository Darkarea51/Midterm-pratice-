import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Userinput {

	public static void main (String args[])throws IOException{

		String output="", input = null;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		// the inputed String is UI (User Input)
		String UI;
		// j(which is the number of times the letter is displayed starts at 0). i is an int
		int i, j=0, repeat=0;
		char c= ' ';
		
		System.out.println("Ask for a word"); 
		System.out.println("Please Enter A Word");
		System.out.println("Read the line that the user inputed");
		UI = br.readLine();
		System.out.println("Transferring to lower case");
		System.out.println(" transfer user input to lower case");
		UI= UI.toLowerCase();
		System.out.println("print inputted word");
		System.out.println("Entered Word \"" + UI + "\"");
		System.out.println("26 letters in alphabet");
		int [] count = new int[26];
		
		System.out.println("Runs through the entered string"); 
		for (i = 0; i < UI.length(); i++) {
			System.out.println("Takes the character input and gets the ASCII chart");
			char a = UI.charAt(i);
			System.out.println("(A) the character transfers into ASCII value or gets the ASCII value"); 
			int number = (int) a;
			System.out.println(" takes the number and subtracts the 'a' value from it then adds 1");
			count[number - 'a']++;
			System.out.println("A value:"+ a);
			System.out.println("Count: " + count);
			System.out.println("J value" + j);
		}
		//System.out.println("goes through ")
		for (j=0; j<count.length; j++) {
			System.out.println(" if the number value is greater than 0");
			if (count[j] > 0) {
				System.out.println("J value (2)" + j);
				System.out.println("prints to the console the character value +97 which is an ASCII value on the chart, prints how many time its used");
				System.out.println(((char)(j+97))+","+count[j]);
			}
		}
		
		
		
		
		
	}
}
