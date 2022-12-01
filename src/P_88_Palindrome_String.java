//String Palindrome
//Send Feedback
//Given a string, determine if it is a palindrome, considering only alphanumeric characters.
//Palindrome
//A palindrome is a word, number, phrase, or other sequences of characters which read the same backwards and forwards.
//Example:
//If the input string happens to be, "malayalam" then as we see that this word can be read the same as forward and 
//backwards, it is said to be a valid palindrome.
//
//The expected output for this example will print, 'true'.
//From that being said, you are required to return a boolean value from the function that has been asked to implement.
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string 
//would be in lower case.
//Output Format:
//The only line of output prints either 'true' or 'false'.
//Note:
//You are not required to print anything. It has already been taken care of.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1 :
//abcdcba
//Sample Output 1 :
//true 
//Sample Input 2:
//coding
//Sample Output 2:
//false




import java.util.*;
public class P_88_Palindrome_String {
	
	
	public static boolean palindromeCheck(String str){
		
		
		int len = str.length();
		if(len == 0)
			return false;
		String revstr = "";
		for(int i = len-1; i >= 0; i--){
			revstr += str.charAt(i);
		}
		if(revstr.equals(str))
			return true;
		else
			return false;
		
		
		
//		int s = 0, e = str.length()-1;
//		
//		while(s <= e){
//			if(str.charAt(s) != str.charAt(e))
//				return false;
//			
//			s++;
//			e--;
//		}
//		return true;
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking your entered string is palindrome or not...");
		String str = ip.nextLine();
		boolean res = palindromeCheck(str);
		if(res == true)
			System.out.println("Yes, this is a Palindrome String...");
		else
			System.out.println("No, this isn't a Palindrome String...");

	}

}
