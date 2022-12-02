//Highest Occuring Character
//Send Feedback
//For a given a string(str), find and return the highest occurring character.
//Example:
//Input String: "abcdeapapqarr"
//Expected Output: 'a'
//Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
//If there are two characters in the input string with the same frequency, return the character which comes first.
//Consider:
//Assume all the characters in the given string to be in lowercase always.
//Input Format:
//The first and only line of input contains a string without any leading and trailing spaces.
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
//abdefgbabfba
//Sample Output 1:
//b
//Sample Input 2:
//xy
//Sample Output 2:
//x


import java.util.*;
public class P_95_Highest_Occuring_Character {
	
	
	public static void hiOcChar(String str){
		
		int len = str.length();
		int preChar = 0, hiOc = Integer.MIN_VALUE, index = 0;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				if(str.charAt(i) == str.charAt(j)){
					preChar++;
				}
			}
			if(preChar > hiOc){
				hiOc = preChar;
				index = i;
			}
			preChar = 0;
		}
		System.out.println("So, the highest occuring character is : " + str.charAt(index) + " Occured " + hiOc + "th times.");
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating and printing the highest occuring character in your entered string :- ");
		System.out.println("So, enter a string :- ");
		String str = ip.nextLine();
		hiOcChar(str);
	}

}
