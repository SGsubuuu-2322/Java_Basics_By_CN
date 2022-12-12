//Print First N Natural Numbers - Code
//Send Feedback
//Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
//Input Format :
//Integer n
//Output Format :
//Numbers from 1 to n (separated by space)
//Constraints :
//1 <= n <= 10000
//Sample Input 1 :
// 6
//Sample Output 1 :
//1 2 3 4 5 6
//Sample Input 2 :
// 4
//Sample Output 2 :
//1 2 3 4



import java.util.*;
public class P_113_Print_First_N_Natural_Numbers_Code {
	
	
	public static void printNnaturalnos(int num){
		if(num == 1){
			System.out.print(num + " ");
			return;
		}
		printNnaturalnos(num-1);
		System.out.print(num + " ");
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing n natural numbers till your entered number : ");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		System.out.println();
		printNnaturalnos(num);
		

	}

}
