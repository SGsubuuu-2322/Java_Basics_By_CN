//Reverse Each Word
//Send Feedback
//Aadil has been provided with a sentence in the form of a string as a function parameter.
//The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
//Example:
//Input Sentence: "Hello, I am Aadil!"
//The expected output will print, ",olleH I ma !lidaA".
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces. 
//The input string represents the sentence given to Aadil.
//Output Format:
//The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1:
//Welcome to Coding Ninjas
//Sample Output 1:
//emocleW ot gnidoC sajniN
//Sample Input 2:
//Always indent your code
//Sample Output 2:
//syawlA tnedni ruoy edoc


import java.util.*;
public class P_93_Reverse_Each_Word {
	
	public static String revEachWord(String str){
		int len = str.length();
		String tStr = "";
		if(len == 0)
			return tStr;
		int i = 0;
		while(i < len){
			tStr = str.charAt(i) + tStr;
			i++;
		}
		return tStr;
	}

	public static void main(String[] args){
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for reversing each word from your entered string...");
		System.out.println("So, enter a string :- ");
		String str = ip.nextLine();
		String tStr = revEachWord(str);
		System.out.println("The reversed word String :- ");
		System.out.println(tStr);
	}

}
