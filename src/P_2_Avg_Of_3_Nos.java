import java.util.*;
public class P_2_Avg_Of_3_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// This is the program for calculating average of three numbers...
		System.out.println("This is the program for calculating of average of the three numbers...");
		System.out.println("So, enter your first number :- ");
		int num1 = ip.nextInt();
		System.out.println("Now, enter your second number :- ");
		int num2 = ip.nextInt();
		System.out.println("And, now enter your third number :- ");
		int num3 = ip.nextInt();
		double res = (num1+num2+num3)/3;
		System.out.println("So, your average is :- " + res);

	}

}
