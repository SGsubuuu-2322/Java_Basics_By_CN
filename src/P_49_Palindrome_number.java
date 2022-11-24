//Palindrome number
//Send Feedback
//Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
//Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
//Sample Input 1 :
//121
//Sample Output 1 :
//true
//Sample Input 2 :
//1032
//Sample Output 2 :
//false



import java.util.*;
public class P_49_Palindrome_number {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking a number is palindrome or not...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		int  rem = 0, temp = num;
		rem = num % 10;
		num /= 10;
		while(num > 0){
			rem = (rem * 10) + (num % 10);
			num /= 10;
		}
		
		if(temp == rem)
			System.out.println("This is a palindrome...");
		else
			System.out.println("This is'nt a palindrome...");
	}

}
