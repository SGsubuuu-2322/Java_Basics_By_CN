import java.util.*;
public class P_114_Fibonacci_Number {
	
	public static int printFibonacci(int num){
		if(num <= 1){
			return num;
		}
		int fibN = printFibonacci(num-1) + printFibonacci(num-2);
		return fibN;
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing n number of fibonacci numbers :- ");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		if(num < 0)
			System.out.println("It is invalid number for the fibonacci series...");
		else {
			System.out.println(printFibonacci(num));
			
		}

	}

}
