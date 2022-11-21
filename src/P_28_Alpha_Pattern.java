//Print the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//7
//Sample Output 1:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
//GGGGGGG
//Sample Input 2:
//6
//Sample Output 2:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF


import java.util.*;
public class P_28_Alpha_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing pattern in alpha manner...");
		System.out.println("So, enter the number :- ");
		int num = ip.nextInt();
		char code = 'A';
		for(int i = 0; i < num; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(code);
			}
			code++;
			System.out.println();
		}

	}

}
