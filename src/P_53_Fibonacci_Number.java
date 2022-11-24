//Fibonacci Number
//Send Feedback
//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//    F(n) = F(n-1) + F(n-2)
//where F(0) = 0 and F(1) = 1
//
//
//Input Format :
//Integer N
//Output Format :
//true or false
//Constraints :
//0 <= n <= 10^4
//Sample Input 1 :
//5
//Sample Output 1 :
//true
//Sample Input 2 :
//14
//Sample Output 2 :
//false    



import java.util.*;
public class P_53_Fibonacci_Number {
	
	public static boolean isMember(int num){
		int a = 0, b = 1;
		if(num == 0)
			return true;
		while((a+b) <= num){
			int temp = a + b;
			a = b;
			b = temp;
			if(temp == num)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the entered number is a fibonacci number or not....");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		if(isMember(num))
			System.out.println("Yes, it is a fibonacci number.");
		else
			System.out.println("No, this is'nt a fibonacci number.");

	}

}
