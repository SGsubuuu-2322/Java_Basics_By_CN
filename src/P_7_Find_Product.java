import java.util.Scanner;

import java.util.*;
public class P_7_Find_Product {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program to calculate the product of two numbers...
		System.out.println("This is the program for calculating the product for two numbers...");
		System.out.println("So, enter the 1st number : ");
		int num1 = ip.nextInt();
		System.out.println("And, now enter the second number : ");
		int num2 = ip.nextInt();
		int res = num1 * num2;
		System.out.println("So, the result of the product is : " + res);

	}

}
