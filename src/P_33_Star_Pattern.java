//Print the following pattern
//Pattern for N = 4
//
//
//
//The dots represent spaces.
//
//
//
//Input Format :
//N (Total no. of rows)
//Output Format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//   *
//  *** 
// *****
//Sample Input 2 :
//4
//Sample Output 2 :
//    *
//   *** 
//  *****
// *******


import java.util.*;
public class P_33_Star_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a equilateral pattern in star...");
		System.out.println("So, enter the length for each side :- ");
		int num = ip.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= (num-i); j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++)
				System.out.print("*");
			for(int l = 1; l < i; l++)
				System.out.print("*");
			System.out.println();
		}
	}

}
