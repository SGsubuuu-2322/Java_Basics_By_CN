//Calculate Power
//Send Feedback
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
//Do this recursively.
//Input format :
//Two integers x and n (separated by space)
//Output Format :
//x^n (i.e. x raise to the power n)
//Constraints :
//0 <= x <= 30
//0 <= n <= 30
//Sample Input 1 :
// 3 4
//Sample Output 1 :
//81
//Sample Input 2 :
// 2 5
//Sample Output 2 :
//32




import java.util.*;
public class P_111_Calculate_Power {
	
	
	public static int powerCalc(int num, int pow){
		if(pow == 1)
			return num;
		int power = num * powerCalc(num, pow-1);
		return power;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the power of your entered number :- ");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		System.out.println("And, now enter the power :- ");
		int pow = ip.nextInt();
		System.out.println("So, the result for " + num + "^" + pow + " : " + powerCalc(num, pow));

	}

}
