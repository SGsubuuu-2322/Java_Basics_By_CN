import java.util.*;
public class P_12_Sum_Of_Even_Nos {

	public static void main(String[] args) {
		Scanner ip = new Scanner (System.in);
		// This is the program for Adding all the even numbers till n...
		System.out.println("This is the program for Adding all the even till n : ");
		System.out.println("So, enter the number till which you want to add :- ");
		int num = ip.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);

	}

}
