//Nth Fibonacci Number
//Send Feedback
//Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//    F(n) = F(n-1) + F(n-2), 
//    Where, F(1) =  1, 
//           F(2) = 1
//Provided N you have to find out the Nth Fibonacci Number.
//Input Format :
//The first line of each test case contains a real number ‘N’.
//Output Format :
//For each test case, return its equivalent Fibonacci number.
//Constraints:
//1 <= N <= 10000     
//Where ‘N’ represents the number for which we have to find its equivalent Fibonacci number.
//
//Time Limit: 1 second
//Sample Input 1:
//6
//Sample Output 1:
//8
//Explanation of Sample Input 1:
//Now the number is ‘6’ so we have to find the “6th” Fibonacci number
//So by using the property of the Fibonacci series i.e 
//
//[ 1, 1, 2, 3, 5, 8, 13, 21]
//So the “6th” element is “8” hence we get the output.



import java.util.*;
public class P_40_Nth_Fibonacci_Number {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the fibonacci number at entered numberth position...");
		System.out.println("So, enter the position number :- ");
		int num = ip.nextInt();
		int n1 = 0, n2 = 1;
		if(num == 1 || num == 2){
			if(num == 1)
				System.out.print("0");
			else
				System.out.print("1");
		}
		else {
			int fib = 0;
			for(int i = 3; i <= num; i++){
				fib = n1 + n2;
				n1 = n2;
				n2 = fib;
			}
			System.out.print(fib);
		}
	}

}
