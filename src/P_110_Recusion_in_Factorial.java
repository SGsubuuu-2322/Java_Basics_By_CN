import java.util.*;
public class P_110_Recusion_in_Factorial {
	
	
	public static int factorial(int num){
		if(num == 0)
			return 1;
		else {
			num *=  factorial(num-1);
			return num;
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating factorial for your entered number :- ");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		int fact = factorial(num);
		System.out.println("So, the factorial is : " + fact);

	}

}
