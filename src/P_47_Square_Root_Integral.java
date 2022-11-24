//Square Root (Integral)
//Send Feedback
//Given a number N, find its square root. You need to find and print only the integral part of square root of N.
//For eg. if number given is 18, answer is 4.
//Input format :
//Integer N
//Output Format :
//Square root of N (integer part only)
//Constraints :
//0 <= N <= 10^8
//Sample Input 1 :
//10
//Sample Output 1 :
//3
//Sample Input 2 :
//4
//Sample Output 2 :
//2



import java.util.*;
public class P_47_Square_Root_Integral {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating square root of your entered number...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		int temp = 1;
		for(int i = 1; i <= num/2; i++){
			temp = i*i;
			if(temp >= num){
				if(temp == num){
					temp = i;
					break;
				}
				else {
					temp = i-1;
					break;
				}
			}
		}
		System.out.println(temp);

	}

}
