//Print the following pattern for the given number of rows.
//Note: N is always odd.
//
//
//Pattern for N = 5
//
//  *
// ***
//*****
// ***
//  *
//  
//  The dots represent spaces.
//
//
//
//  Input format :
//  N (Total no. of rows and can only be odd)
//  Output format :
//  Pattern in N lines
//  Constraints :
//  1 <= N <= 49
//  Sample Input 1:
//  5
//  Sample Output 1:
//    *
//   ***
//  *****
//   ***
//    *
//  Sample Input 2:
//  3
//  Sample Output 2:
//    *
//   ***
//    *


import java.util.*;
public class P_35_Diamond_of_stars {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a diamond pattern in star for odd numbrs...");
		System.out.println("So, enter a odd number :-");
		int num = ip.nextInt();
	    if(num % 2 != 0){
			int p1 = (num/2) + 1, p2 = num/2;
			for(int i = 1; i <= p1; i++){
				for(int j = i; j < p1; j++)
					System.out.print(" ");
				for(int k = 1; k <= i; k++)
					System.out.print("*");
				for(int l = 1; l < i; l++)
					System.out.print("*");
				System.out.println();
			}
			for(int i = 1; i <= p2; i++){
				for(int j = 1; j <= i; j++)
					System.out.print(" ");
				for(int k = i; k <= p2; k++)
					System.out.print("*");
				for(int l = i; l < p2; l++)
					System.out.print("*");
				System.out.println();
			}
		}
		else {
			System.out.println("0, -1 and, even numbers are not allowed here...");
		}

	}

}
