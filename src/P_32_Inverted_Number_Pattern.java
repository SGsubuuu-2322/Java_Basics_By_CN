//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//4444
//333
//22
//1
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//55555 
//4444
//333
//22
//1
//Sample Input 2:
//6
//Sample Output 2:
//666666
//55555 
//4444
//333
//22
//1


import java.util.*;
public class P_32_Inverted_Number_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a half inverted triangle of numbers...");
		System.out.println("So, enter a number :-");
		int num = ip.nextInt();
		int temp = num;
		for(int i = 0; i < num; i++){
			for(int j = 1; j <= (num-i); j++)
			   System.out.print(temp);
			System.out.println();
			temp--;
		}
		
	}

}
