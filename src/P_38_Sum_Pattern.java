//Sum Pattern
//Send Feedback
//Write a program to print triangle of user defined integers sum.
//Input Format :
//A single integer, N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//1=1
//1+2=3
//1+2+3=6
//Sample Input 2 :
// 5
//Sample Output 2 :
//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10
//1+2+3+4+5=15



import java.util.*;
public class P_38_Sum_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing sum pattern for n numbers...");
		System.out.println("So, enter a number till which you want sum :- ");
		int num = ip.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j);
				sum += j;
				if(j < i)
					System.out.print("+");
			}
			System.out.print("=" + sum);
			System.out.println();
			sum = 0;
		}

	}

}
