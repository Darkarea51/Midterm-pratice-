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





import java.io.*;
import java.util.Scanner;

public class MidTermWritten {

	public static void main(String[] args) throws IOException{

		//reading in from a scanner
		//import java.io*; to import complete package
		// import java.io.file and import java.util.Scanner 
		//File temp = new File("filename.txt");
		//Scanner file = new Scanner("filename.txt");
		// or 
		//Scanner file2 = new Scanner(new File("filename.txt"));
		
		
		//System.out.println("file.nextLine()");
		
		//initializing variables
		//int is a whole number 
		//int age = 10; 
		//float is a floating point 
		//int num; // declaring a variable
		//num = 10; // assigning the variable to a value (initializing) 
		//System.out.println(num);
		
		
		//primitive type
		byte a = 45;
		short b = 345;
		int c = 533;
		long d = 5;
		
		float e = (float)(56.4);
		double f = 5.1;
		
		char g ='$';
		
		System.out.println("DIE");
		
		boolean h = true;
		//boolean i = false;
		
		
		while (true){
			Scanner consoleInput = new Scanner(System.in);
			String input;
			System.out.println("input a number");
			input = consoleInput.nextLine();
			System.out.println(input);
			if (Integer.parseInt(input)==10 ){
				System.out.println("congrats you are a EPIC SAUSE");
				break;
			}
		}
		
		
		
		
		boolean[] bestate = new boolean[100]; 
		int counter = 0; 

		for(int i = 0; i<100; i+=2){
			counter++;
			if (counter == 2){
				bestate[i] = true;
				counter = 0;

			}		
		}
		

		
		if(h == true){
			System.out.println("cum");
			h=false; 
		}
		
		// 8 primitive type 
		// byte, short, int, long, float, double, char, boolean 
		// dont use float, use double 
		// char is characters, surround value with single quotes "" 
		
		//Arithmetic using variables
		// + - addition, - Subtraction, * multiplication, / - division, % - mod or remainder 
		
		int z=2;
		System.out.println(a%z);
		
		
		//TYPE Convertion 
		//int j =(int)3.4;
		String A = "3.4";
	//	char a = 'H';
		
		//string to int
		//int i = Integer.parseInt("100");
		//System.out.println(i);
		
		//int to string 
		String str2 = Integer.toString(100);
		System.out.print(str2);
		
		//string to double 
		double D = Double.parseDouble("69.4");
		System.out.println(D);
		
		//double to string 
		String str69 = Double.toString(69.5);
		System.out.println(str69);
		
		
		
		
		
		//Checking Strings, characters, particular characters in a String, numbers, etc. from input
		
		String s = "poopy";
		s.charAt(3);
		System.out.println(s.charAt(3));
		
		
		//1D arrays 
		String backpack[] = {"John","Jared"};
		String CABT[] = {"Spoon","Fork","pencil"};
		
		for(int p=0; p<backpack.length; p+=1){
			System.out.println("XDDDD:" + backpack[p]);
		}
		System.out.println(backpack[0]);
		System.out.println(CABT[1]);
		
		
		int[][] number8 = new int [10][10];
		number8[0][0] = 100;
	
		//2D arrays 
		int[][] number = new int [5][5];
		number[0][0] = 100;
		number[0][1] = 7000;
		for (int o = 0; o<5;o++)
		      for (int cum = 0; cum<5; cum++)
		      System.out.println("cummm:"+number[o][cum]);
		
		System.out.println(number[0][0]);
		System.out.println(number[0][1]);		
	}
}

