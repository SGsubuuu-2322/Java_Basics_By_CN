import java.util.*;
public class P_9_Checking_Prime {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program for checking the number is prime or not...
		System.out.println("This is the program for checkimg a number is prime or not...");
		System.out.println("So, enter a number : ");
		int num = ip.nextInt();
		int isPrime = 0;
		if(num == 0 || num == 1)
			System.out.println("This is not prime Number.");
		else if(num == 2)
			System.out.println("This is a prime Number.");
		else {
			for(int i = 2; i <= (num-1); i++) {
				if(num % i == 0)
					isPrime = 1;
			}
		}
		if(isPrime == 0)
			System.out.println("Yes, this is a prime number.");
		else
			System.out.println("No, this is not a prime number.");

	}

}
