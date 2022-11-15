import java.util.*;
public class P_4_Checking_Number_Nature {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// This is the program for checking the nature of a number...
		System.out.println("This is the program for checking the nature of a number...");
		System.out.println("So, enter a number :-");
		int num = ip.nextInt();
		if(num > 0)
			System.out.println("This is a positive number.");
		else if(num < 0)
			System.out.println("This is a negative number.");
		else
			System.out.println("This is a Zero.");
		

	}

}
