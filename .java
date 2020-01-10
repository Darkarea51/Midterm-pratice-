import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class sentence {

	public static void main(String args[])throws IOException {
		int i,j=0, repeat=0;
		String output="",input = null;
		char c=' ';
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String US;
		System.out.println("Enter a sentence");
		US = br.readLine();
		System.out.println("Entered String \""+US+"\"");
		US=US.toLowerCase();
		int [] count = new int[26];
		for (i = 0; i < US.length(); i++) {
			char a = US.charAt(i);
			int number = (int)a;
			count[number -'a']++;	
		}
		for (j = 0; j < count.length; j++) {
			if (count[j] > 0) {
				System.out.println(((char)(j+97))+","+count[j]);
		
			}
		}		
	}
}
