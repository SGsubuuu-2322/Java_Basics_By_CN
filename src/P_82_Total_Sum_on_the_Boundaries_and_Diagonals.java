//Total Sum on the Boundaries and Diagonals
//Send Feedback
//For a given two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.
//Input format:
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains a single integer value, 'N' representing the 'rows' and 'columns' for the 
//two-dimensional square matrix.
//
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//
//Each of the ith row constitutes 'N' column values separated by a single space.
//Output format:
//For each test case, print the single integer denoting the sum.
//
//Output for every test case will be printed in a seperate line.
//Constraints:
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1sec
//Sample input 1:
//1
//3
//1 2 3
//4 5 6
//7 8 9
//Sample Output 1:
//45
//Explanation for Sample Output 1:
//The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 
//
//The first-diagonal elements are 1, 5 and 9. 
//
//The second-diagonal elements are 3, 5 and 7.
//
//We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element 
//and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.
//
//Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
//Sample input 2:
//2
//5
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
//4
//1 2 3 10
//4 5 6 11
//7 8 9 12
//13 14 15 16
//Sample Output 2:
//273
//136



import java.util.*;
public class P_82_Total_Sum_on_the_Boundaries_and_Diagonals {
	
	public static int [][] inputArray(Scanner ip){
		System.out.println("So, now enter the number of elements you want in your 2D N*N array :- ");
		int len = ip.nextInt();
		int [][] arr = new int[len][len];
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				System.out.println("Enter the " + i + "th row and " + j + "th col :- ");
				arr[i][j] = ip.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void printArray(int [][] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print("[");
			for(int j = 0; j< arr[0].length; j++){
				System.out.print(arr[i][j]);
				if(j < arr[0].length-1)
					System.out.print(" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
	public static int bdSum(int [][] arr){
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			sum += arr[0][i];
			sum += arr[arr.length-1][i];
		}
		
		for(int i = 1; i < arr.length-1; i++){
			sum += arr[0][i];
			sum += arr[arr.length-1][i];
		}
		
		for(int i = 1; i < arr.length-1; i++){
			sum += arr[i][i];
			sum += arr[i][arr.length-1-i];
		}
		
		if(arr.length%2 != 0){
			sum -= arr[arr.length/2][arr.length/2];
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if (i == 0 || j == 0 || i == j || i == arr.length - 1 || j == arr[i].length - 1
//						|| i + j == arr.length - 1) {
//					sum += arr[i][j];
//				}
//			}
//		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the sum total of boundries and diagonal of a 2D array :- ");
		int [][] arr = inputArray(ip);
		System.out.println("So, your entered 2D array is as follows :- ");
		printArray(arr);
		int sumTotal = bdSum(arr);
		System.out.println("So, the total sum of boundries and diagonals of your entered array is :- " + sumTotal);
		

	}

}
