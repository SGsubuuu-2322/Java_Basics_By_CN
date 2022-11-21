//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//A
//BC
//CDE
//DEFG
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 13
//Sample Input 1:
//5
//Sample Output 1:
//A
//BC
//CDE
//DEFG
//EFGHI
//Sample Input 2:
//6
//Sample Output 2:
//A
//BC
//CDE
//DEFG
//EFGHI
//FGHIJK


import java.util.*;
public class P_29_Character_Pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing half triangular character pattern...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		char code = 'A';
		for(int i = 0; i < num; i++){
			char temp = code;
			for(int j = 0; j <= i; j++){
				System.out.print(temp);
				temp++;
			}
			code++;
			System.out.println();
		}
	}

}
