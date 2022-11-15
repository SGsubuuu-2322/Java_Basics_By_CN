import java.util.*;
public class P_10_Largest_Of_n_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program to check Largest among N Numbers....
		System.out.println("This is the program for checking Largest among n numbers");
		System.out.println("So, now enter the number among how many numbers you want check");
		int num = ip.nextInt();
		int largest = -2147483648;
		int  temp_no;
		for(int i = 1; i <= num; i++) {
			System.out.println("Enter number-" + i + " ; ");
			temp_no = ip.nextInt();
			if(largest < temp_no)
				largest = temp_no;
		}
		System.out.println("So, the largest number is : " + largest);

	}

}
