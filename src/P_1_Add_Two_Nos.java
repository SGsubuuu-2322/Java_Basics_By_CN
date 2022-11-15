import java.util.*;
public class P_1_Add_Two_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program to add two numbers.
		System.out.println("This is a Addition Program...");
		int num1, num2, res;
		System.out.println("So, enter your first number :- ");
		num1 = ip.nextInt();
		System.out.println("And, now enter your second number :- ");
		num2 = ip.nextInt();
		res = num1 + num2;
		System.out.println("Now, your addition result is : " + res);

	}

}
