//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//Note : For this question, you can assume that 0 raised to the power of 0 is 1
//
//
//Input format :
//Two integers x and n (separated by space)
//Output Format :
//x^n (i.e. x raise to the power n)
//Constraints:
//0 <= x <= 8 
//0 <= n <= 9
//Sample Input 1 :
// 3 4
//Sample Output 1 :
//81
//Sample Input 2 :
// 2 5
//Sample Output 2 :
//32


import java.util.*;
public class P_23_Find_Power_Of_A_number {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the x to the power of n...");
		System.out.println("So, Enter the exponent number or X :- ");
		int power = ip.nextInt();
		System.out.println("And, now enter the base number :- ");
		int base = ip.nextInt();
		int result = 1;
		for(int i = 1; i <= power; i++){
			result *= base;
		}
		System.out.println(result);

	}

}
