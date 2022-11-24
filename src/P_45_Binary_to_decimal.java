//Binary to decimal
//Send Feedback
//Given a binary number as an integer N, convert it into decimal and print.
//Input format :
//An integer N in the Binary Format
//Output format :
//Corresponding Decimal number (as integer)
//Constraints :
//0 <= N <= 10^9
//Sample Input 1 :
//1100
//Sample Output 1 :
//12
//Sample Input 2 :
//111
//Sample Output 2 :
//7



import java.util.*;

public class P_45_Binary_to_decimal {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating binary to decimal...");
		System.out.println("So, enter a number :- ");
		long num = ip.nextLong();
		long rem = 0, dec = 0, flag = 0;

		while(num > 0){
			rem = num % 10;
			if(flag == 0 || flag == 1){
				if(flag == 0)
					dec += (rem * 1);
				else
					dec += (rem * 2);
			}
			else{
				long pow = 1;
				for(int i = 1; i <= flag; i++)
					pow *= 2;
				dec += (rem * pow);
			}
			flag++;
		    num /= 10;
		}
		System.out.println(dec);
	}

}
