import java.util.*;
public class P_3_Largest_Of_3_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// This is the program for calculating largest of 3 numbers.
		System.out.println("This is program for calculating largest between 3 numbers...");
		System.out.println("So, enter your first number :- ");
		int num1 = ip.nextInt();
		System.out.println("Now, enter your second number :- ");
		int num2 = ip.nextInt();
		System.out.println("And now enter your third number :- ");
		int num3 = ip.nextInt();
		if(num1 > num2 && num1 >num3)
			System.out.println("Number 1 is the largest :" + num1);
		else if(num2 > num1 && num2 > num3)
			System.out.println("Number 2 is the largest :" + num2);
		else if(num3 > num1 && num3 > num2)
			System.out.println("Number 3 is the largest :" + num3);
		else 
			System.out.println("All the numbers are equal.");

	}

}
