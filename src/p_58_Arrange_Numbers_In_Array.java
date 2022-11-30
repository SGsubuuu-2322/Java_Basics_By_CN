//Arrange Numbers In Array
//Send Feedback
//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//Note:
//You need not print the array. You only need to populate it.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first and the only line of each test case or query contains an integer 'N'.
//Output Format :
//For each test case, print the elements of the array/list separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^4
//
//Time Limit: 1sec
//Sample Input 1 :
//1
//6
//Sample Output 1 :
//1 3 5 6 4 2
//Explanation of Sample Input 1 :
//Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index,
//then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
//Sample Input 2 :
//2
//9
//3
//Sample Output 2 :
//1 3 5 7 9 8 6 4 2
//1 3 2



import java.util.*;
public class P_58_Arrange_Numbers_In_Array {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing an certain number series...");
		System.out.println("So, enter the length of the array :- ");
		int len = ip.nextInt();
		int temp1 = 1, temp2 = 1, flag1 = 0, flag2 = 1;
		int [] arr = new int [len];
		for(int i = 0; i < len; i++){
			if(temp2 % 2 != 0){
				arr[flag1] = temp1;
				flag1++;
			}
			else if(temp2 % 2 == 0){
				arr[len-flag2] = temp1;
				flag2++;
			}
			
			temp1++;
			temp2++;
		}
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");

	}

}
