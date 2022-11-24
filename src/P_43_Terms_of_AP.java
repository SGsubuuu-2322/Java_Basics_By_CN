//Terms of AP
//Send Feedback
//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
//Input format :
//Integer x
//Output format :
//Terms of series (separated by space)
//Constraints :
//1 <= x <= 1,000
//Sample Input 1 :
//10
//Sample Output 1 :
//5 11 14 17 23 26 29 35 38 41
//Sample Input 2 :
//4
//Sample Output 2 :
//5 11 14 17



import java.util.*;
public class P_43_Terms_of_AP {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing n numbers of AP series...");
		System.out.print("So, enter the number :- ");
		int num = ip.nextInt();
		int inc = 1;
		for(int i= 1; inc <= num; i++){
			int temp = (3*i) + 2;
			if(temp % 4 != 0){
				System.out.print(temp + " ");
				inc++;
			}
			
		}

	}

}
