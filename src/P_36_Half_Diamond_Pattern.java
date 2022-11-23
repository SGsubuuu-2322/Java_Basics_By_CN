//Half Diamond Pattern
//Send Feedback
//Write a program to print N number of rows for Half Diamond pattern using stars and numbers
//Note : There are no spaces between the characters in a single line.
//
//
//Input Format :
//A single integer: N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//*
//*1*
//*121*
//*12321*
//*121*
//*1*
//*
//Sample Input 2 :
// 5
//Sample Output 2 :
//*
//*1*
//*121*
//*12321*
//*1234321*
//*123454321*
//*1234321*
//*12321*
//*121*
//*1*
//*


import java.util.*;
public class P_36_Half_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing half diamond pattern in numbers and stars...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		System.out.println("*");
		
		for(int i = 1; i <= num; i++){
			int temp = 0;
			System.out.print("*");
			for(int j = 1; j <= i; j++){
				System.out.print(j);
				temp = j;
			}
			temp--;
			for(int k = 1; k < i; k++){
				System.out.print(temp);
				temp--;
			}
			System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i < num; i++){
			int temp = 0;
			System.out.print("*");
			for(int j = 1; j <= num-i; j++){
				System.out.print(j);
				temp = j;
			}
			temp--;
			for(int k = 1; k < num-i; k++){
				System.out.print(temp);
				temp--;
			}
			System.out.print("*");
			System.out.println();
		}
		
		System.out.println("*");

	}

}
