//Sum or Product
//Send Feedback
//Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
//If C is equal to -
// 1, then print the sum
// 2, then print the product
// Any other number, then print '-1' (without the quotes)
//Input format :
//Line 1 : Integer N
//Line 2 : Choice C
//Output Format :
// Sum or product according to user's choice
//Constraints :
//1 <= N <= 12
//Sample Input 1 :
//10
//1
//Sample Output 1 :
//55
//Sample Input 2 :
//10
//2
//Sample Output 2 :
//3628800
//Sample Input 3 :
//10
//4
//Sample Output 3 :
//-1



import java.util.*;
public class P_42_Sum_or_Product {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program to calculating sum or product upto entered numbers...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		System.out.println("Now, enter your choice '1' for sum and '2' for product :- ");
		int choice  = ip.nextInt();
		int sum = 0, product = 1;
		if(choice == 1) {
			for(int i = 1; i <= num; i++){
				sum += i;
			}
			System.out.println(sum);
		}
		else if(choice == 2){
			for(int i = 1; i <= num; i++){
				product *= i;
			}
			System.out.println(product);
		}
		else {
			System.out.println("Enter a valid choice...");
		}

	}

}
