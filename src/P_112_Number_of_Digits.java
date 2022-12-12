//Number of Digits
//Send Feedback
//Given the number 'n', find out and return the number of digits present in a number recursively.
//Input Format :
//Integer n
//Output Format :
//Count of digits
//Constraints :
//1 <= n <= 10^6
//Sample Input 1 :
// 156
//Sample Output 1 :
//3
//Sample Input 2 :
// 7
//Sample Output 2 :
//1



import java.util.*;
public class P_112_Number_of_Digits {
	
	public static int calDigits(int num, int count){
		num = num/10;
		if(num == 0)
			return 1;
		
		count = calDigits(num, count);
		count ++;
		return count;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating and printing number of digits present in your entered number :- ");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		int count = 0;
		System.out.println("So, the digits in your entered number is :- " + calDigits(num, count));
		

	}

}
