import java.util.*;
public class P_115_Fibonacci_Number_Series {
	
	public static int n1 = 0, n2 = 1, n3 = 0;
	
	
	public static void printFibonacciNumSeries(int num){
		if(num > 0){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacciNumSeries(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This the program for printing the fibonacci number series till you want :- ");
		System.out.println("So, enter the number till which you want the fibonacci number series :- ");
		int num = ip.nextInt();
		if(num <= 0){
			System.out.println("There is no fibonacci number in 0th index...");
		}
		else if(num == 1 || num == 2){
			if(num == 1)
				System.out.print(0);
			else
				System.out.print(0 + " " + 1);
		}
		else{
			System.out.print(0 + " " + 1);
			printFibonacciNumSeries(num-2);
		}

	}

}
