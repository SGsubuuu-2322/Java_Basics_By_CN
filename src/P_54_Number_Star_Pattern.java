//Number Star Pattern
//Send Feedback
//Print the following pattern for given number of rows.
//Input format :
//
//Line 1 : N (Total number of rows)
//
//Sample Input :
//   5
//Sample Output :
//1234554321
//1234**4321
//123****321
//12******21
//1********1



import java.util.*;
public class P_54_Number_Star_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a certain type of pattern with numbers and stars...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		for(int i = 0; i < num; i++){
			for(int j = 1; j <= num-i; j++){
				System.out.print(j);
			}
			for(int k = 1; k <= i; k++){
				System.out.print("*");
			}
			for(int l = 1; l <= i; l++){
				System.out.print("*");
			}
			for(int m = num-i; m >= 1; m--){
				System.out.print(m);
			}
			
			System.out.println();
		}
	}

}
