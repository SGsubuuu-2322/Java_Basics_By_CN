//Remove character
//Send Feedback
//For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.
//The input string will remain unchanged if the given character(X) doesn't exist in the input string.
//Input Format:
//The first line of input contains a string without any leading and trailing spaces.
//
//The second line of input contains a character(X) without any leading and trailing spaces.
//Output Format:
//The only line of output prints the updated string. 
//Note:
//You are not required to print anything explicitly. It has already been taken care of.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1:
//aabccbaa
//a
//Sample Output 1:
//bccb
//Sample Input 2:
//xxyyzxx
//y
//Sample Output 2:
//xxzxx


import java.util.*;
public class P_94_Remove_character {
	
	public static void remChar(String str, char ch){
		int len = str.length();
		for(int i = 0; i < len; i++){
			if(ch != str.charAt(i)){
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing your entered string by removing your desired character :- ");
		System.out.println("So, enter the String :- ");
		String str = ip.nextLine();
		System.out.println("And, now enter the character you wanna remove :- ");
		char ch = ip.next().charAt(0);
		remChar(str, ch);
		

	}

}
