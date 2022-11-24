//Reverse of a number
//Send Feedback
//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.
//
//
//Input format :
//Integer N
//Output format :
//Corresponding reverse number
//Constraints:
//0 <= N < 10^8
//Sample Input 1 :
//1234
//Sample Output 1 :
//4321
//Sample Input 2 :
//1980
//Sample Output 2 :
//891



import java.util.*;
public class P_44_Reverse_of_a_number {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing reverse of the entered number...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		int temp1 = num % 10;
		num /= 10;
		while(num > 0){
			temp1 = (temp1 * 10) + (num % 10);
			num /= 10;
		}
		System.out.println(temp1);
		
		
		
		
		
		
//		while(num > 0){
//			System.out.print(num % 10);
//			num /= 10;
//		}
	}

}
