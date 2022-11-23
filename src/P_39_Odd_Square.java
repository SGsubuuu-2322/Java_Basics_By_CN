//Odd Square
//Send Feedback
//Write a program to print the pattern for the given N number of rows.
//For N = 4
//1357
//3571
//5713
//7135
//Input Format :
//A single integer: N
//Output Format :
//Required Pattern
//Constraints :
//0 <= N <= 50
//Sample Input 1 :
//3
//Sample Output 1 :
//135
//351
//513
//Sample Input 2 :
// 5
//Sample Output 2 :
//13579
//35791
//57913
//79135
//91357



import java.util.*;
public class P_39_Odd_Square {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing odd square pattern for n numbers...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		int temp1 = 1, temp2 = 1;
		for(int i = 0; i < num; i++){
			temp1 = temp2;
			for(int j = 1; j <= num-i; j++){
				System.out.print(temp1);
				temp1 += 2;
				if(j == 1)
					temp2 = temp1;
			}
			int temp3 = 1;
			for(int j = 1; j <= i; j++){
				System.out.print(temp3);
				temp3 += 2;
			}
			System.out.println();
		}

	}

}
