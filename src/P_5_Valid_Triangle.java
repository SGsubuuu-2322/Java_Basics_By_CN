import java.util.*;
public class P_5_Valid_Triangle {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// This is the program for checking a valid triangle...
		System.out.println("This is the program for checking a valid triangle...");
		System.out.println("So, enter the measurement for Side A : ");
		int num1 = ip.nextInt();
		System.out.println("Now, enter the measurement for side B : ");
		int num2 = ip.nextInt();
		System.out.println("And, enter the measurement for side C : ");
		int num3 = ip.nextInt();
		if((num1 + num2) > num3 || (num2 + num3) > num1 || (num3 + num1) > num2)
			System.out.println("This is a valid triangle.");
		else
			System.out.println("This is not a valid triangle.");
		

	}

}
