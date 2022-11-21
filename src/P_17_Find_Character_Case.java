//Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//1, if the character is an uppercase alphabet (A - Z)
//0, if the character is a lowercase alphabet (a - z)
//-1, if the character is not an alphabet
//Input format :
//Single Character
//Output format :
//1 or 0 or -1
//Constraints :
//Input can be any character
//Sample Input 1 :
//v
//Sample Output 1 :
//0
//Sample Input 2 :
//V
//Sample Output 2 :
//1
//Sample Input 3 :
//#
//Sample Output 3 :
//-1


import java.util.*;
public class P_17_Find_Character_Case {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking your entered character is in upper_case or in low_case :- ");
		System.out.println("So, enter a character of your choice :- ");
		char code = ip.next().charAt(0);
		if(code >= 97 && code <= 122)
			System.out.println("0");
		else if(code >= 65 && code <= 90)
			System.out.println("1");
		else
			System.out.println("-1");

	}

}
