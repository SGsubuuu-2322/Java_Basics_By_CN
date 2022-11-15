import java.util.*;
public class P_8_Print_Even_Numbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		// Program for printing N number of Even numbers...
		System.out.println("This is the program for printing N number of even numbers...");
		System.out.println("So, enter the number of even numbers you want to printout on the screen : ");
		int num = ip.nextInt();
		int i = 1, even_no = 2;
		while(i <= num) {
			if(even_no % 2 == 0) {
				System.out.println(even_no);
				i++;
			}
			even_no++;
		}

	}

}
