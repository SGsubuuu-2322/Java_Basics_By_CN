//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE
//Input format :
//N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//8
//Sample Output 1:
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH
//Sample Input 2:
//7
//Sample Output 2:
//G
//FG
//EFG
//DEFG
//CDEFG
//BCDEFG
//ABCDEFG


import java.util.*;
public class P_30_Interesting_Alphabets {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for pritning half triangle with interesting alphabets pattern...");
		System.out.println("So, Enter a number :-");
		int num = ip.nextInt();
		char code = 'A';
		code += num;
		for(int i = 1; i <= num; i++){
			char temp = code;
			temp -= i;
			for(int j = 1; j <= i; j++){
				System.out.print(temp);
				temp++;
			}
			System.out.println();
		}
		
	}

}
