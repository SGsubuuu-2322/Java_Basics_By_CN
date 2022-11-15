import java.util.*;
public class P_11_Check_Triangle {

	public static void main(String[] args) {
		Scanner  ip = new Scanner(System.in);
		// Program to check the type of triangle...
		System.out.println("This is the program for checking the type of triangle...");
		System.out.println("So, enter the measurement for side A - ");
		int num1 = ip.nextInt();
		System.out.println("And, now enter the measurement for Side B - ");
		int num2 = ip.nextInt();
		System.out.println("And, now enter the measurement for side C - ");
		int num3 = ip.nextInt();
		if(num1 == num2 && num2 == num3)
			System.out.println("Its an Equilateral Triangle.");
		else if((num1 == num2 && num1 > num3) || (num2 == num3 && num2 > num1) || (num3 == num1 && num3 > num2))
			System.out.println("This is an Isosceles Triangle.");
		else
			System.out.println("This is a Scalene Triangle.");

	}

}
