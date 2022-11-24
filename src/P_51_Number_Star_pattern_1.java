//Number Star pattern 1
//Send Feedback
//Print the following pattern for given number of rows.
//Input format :
//Integer N (Total number of rows)
//Output Format :
//Pattern in N lines
//Sample Input :
//   5
//Sample Output :
// 5432*
// 543*1
// 54*21
// 5*321
// *4321



import java.util.*;
public class P_51_Number_Star_pattern_1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a certain number star pattern...");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		int temp = num;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num-i; j++) {
				System.out.print(temp);
				temp--;
			}
			System.out.print("*");
			for(int k = i-1; k >= 1; k--)
				System.out.print(k);
			temp = num;
			System.out.println();
		}
	}

}
