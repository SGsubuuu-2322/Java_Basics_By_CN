//All Prime Numbers
//Send Feedback
//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines.
//Input Format :
//Integer N
//Output Format :
//Prime numbers in different lines
//Constraints :
//1 <= N <= 100
//Sample Input 1:
//9
//Sample Output 1:
//2
//3
//5
//7
//Sample Input 2:
//20
//Sample Output 2:
//2
//3
//5
//7
//11
//13
//17
//19

import java.util.*;
public class P_41_All_Prime_Numbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing prime numbers in different lines upto enterd number...");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		int isPrime = 1;
		int  i = 1;
		while(i <= num){
			if(i == 1 || i == 2){
				if(i == 2)
					System.out.println(i);
			}
			else {
				for(int j = 2; j < i; j++){
					if(i % j == 0){
						isPrime = -1;
						break;
					}
				}
				if(isPrime == 1)
					System.out.println(i);
				isPrime = 1;
				
			}
			i++;
		}
		
	}

}
