import java.util.*;
public class P_13_Find_GCD {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program to find the GCD  among two Numbers..
		System.out.println("This is the program for finding out the GCD among the two numbers...");
		System.out.println("So, enter the 1st number :- ");
		int num1 = ip.nextInt();
		System.out.println("And, now enter the 2nd number :- ");
		int num2 = ip.nextInt();
		int num = num1, gcd = 0;
		if(num1 > num2)
			num = num2;
		for(int i = 1; i <= num; i++) {
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		System.out.println("So, largest GCD is " + gcd);
		

	}

}
