import java.util.*;
public class P_14_Printing_N_Fibonacci_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program for printing N no. of fibonacci numbers  between 0 to N...
		System.out.println("This is the program for printing N no. of Fibonacci numbers  between 0 to N...");
		System.out.println("So, enter the number of fibonacci numbers you want to print :- ");
		int num = ip.nextInt();
		int num1 = 0, num2 = 1;
		int fibNum = num1 + num2;
		System.out.print(num1 + " " + num2 + " ");
		while(fibNum <= num){
			System.out.print(fibNum + " ");
			
			num1 = num2;
			num2 = fibNum;
			
			fibNum = num1 + num2;
		}

	}

}
