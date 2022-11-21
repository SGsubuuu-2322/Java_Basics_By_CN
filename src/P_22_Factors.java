//Write a program to print all the factors of a number other than 1 and the number itself.
//Input Format :
//A single integer, n
//Output Format :
//All the factors of n excluding 1 and the number itself
//Constraints :
//0 <= n <= 10,000
//Sample Input 1 :
//8
//Sample Output 1 :
//2 4
//Sample Input 2 :
//11
//Sample Output 2 :
//
//
//
//Explanation of Sample Output 2 :
//No output as 11 is prime having factors as 1 and 11 only


import java.util.*;
public class P_22_Factors {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for for computing all the factors of a number other than one...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		for(int i = 2; i < num; i++){
			if(num % i == 0)
				System.out.print(i + " ");
		}

	}

}
