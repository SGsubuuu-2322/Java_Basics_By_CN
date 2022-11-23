//Parallelogram Pattern
//Send Feedback
//Write a program to print parallelogram pattern for the given N number of rows.
//For N = 4
//
//
//
//The dots represent spaces.
//Input Format :
// A single integer : N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//***
// ***
//  ***
//Sample Input 2 :
//5
//Sample Output 2 :
//*****
// *****
//  *****
//   *****
//    *****


import java.util.*;
public class P_37_Parallelogram_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing parallelogram pattern in stars for n numbers...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1; j < i; j++)
				System.out.print(" ");
			for(int k = 1; k <= num; k++)
				System.out.print("*");
			System.out.println();
		}
	}

}
