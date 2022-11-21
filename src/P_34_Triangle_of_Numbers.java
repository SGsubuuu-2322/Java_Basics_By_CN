//Print the following pattern for the given number of rows.
//Pattern for N = 4
//
//...1
//..232
//.34543
//4567654
//
//The dots represent spaces.
//
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints :
//0 <= N <= 50
//Sample Input 1:
//5
//
//Sample Output 1:
//    1
//   232
//  34543
// 4567654
//567898765
//
//Sample Input 2:
//4
//Sample Output 2:
//    1
//   232
//  34543
// 4567654

import java.util.*;
public class P_34_Triangle_of_Numbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing equilateral triangle in number pattern...");
		System.out.println("So, enter a number :- ");
		int num = ip.nextInt();
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= (num-i); j++){
				System.out.print(" ");
			}
			int temp1 = i;
			for(int k = 1; k <= i; k++){
				System.out.print(temp1);
				temp1++;
			}
			int temp2 = temp1-2;
			for(int l = 1; l < i; l++){
				System.out.print(temp2);
				temp2--;
			}
			System.out.println();
		}
	}

}
