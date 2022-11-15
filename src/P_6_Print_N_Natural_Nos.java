import java.util.*;
public class P_6_Print_N_Natural_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program to print N Natural numbers...
		System.out.println("This is the program for printing N natural numbers...");
		System.out.println("Enter the number till which you want to print :- ");
		int num = ip.nextInt();
		for(int i = 0; i <= num; i++)
			System.out.println(i);

	}

}
