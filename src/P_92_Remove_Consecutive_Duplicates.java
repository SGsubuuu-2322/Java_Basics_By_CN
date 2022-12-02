//Remove Consecutive Duplicates
//Send Feedback
//For a given string(str), remove all the consecutive duplicate characters.
//Example:
//Input String: "aaaa"
//Expected Output: "a"
//
//Input String: "aabbbcc"
//Expected Output: "abc"
// Input Format:
//The first and only line of input contains a string without any leading and trailing spaces. All the characters
//in the string would be in lower case.
//Output Format:
//The only line of output prints the updated string.
//Note:
//You are not required to print anything. It has already been taken care of.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1:
//aabccbaa
//Sample Output 1:
//abcba
//Sample Input 2:
//xxyyzxx
//Sample Output 2:
//xyzx


import java.util.*;
public class P_92_Remove_Consecutive_Duplicates{
	
	public static void remConDup(String str){
		int len = str.length();
		String temp = "";
		int fact = 0;
		temp += str.charAt(0);
		for(int i = 0; i < len; i++){
			if(temp.charAt(fact) != str.charAt(i)){
				temp += str.charAt(i);
				fact++;
			}
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for removing consecutive duplicates from strings :- ");
		System.out.println("So, enter the strings :- ");
		String str = ip.next();
		remConDup(str);
	}

}
