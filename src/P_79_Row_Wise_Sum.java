//Row Wise Sum
//Send Feedback
//For a given two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements 
//in a single line, separated by a single space.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
//They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
//
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//
//Each of the ith row constitutes 'M' column values separated by a single space.
//Output Format :
//For each test case, print the sum of every ith row elements in a single line separated by a single space.
//
//Output for every test case will be printed in a seperate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//4 2 
//1 2 
//3 4 
//5 6 
//7 8
//Sample Output 1:
//3 7 11 15 
//Sample Input 2:
//2
//2 5 
//4 5 3 2 6 
//7 5 3 8 9
//4 4
//1 2 3 4
//9 8 7 6
//3 4 5 6
//-1 1 -10 5
//Sample Output 2:
//20 32 
//10 30 18 -5 


import java.util.*;
public class P_79_Row_Wise_Sum {
	
	public static int [][] inputArray(Scanner ip){
		System.out.println("So, now enter the number of rows you want in your array :- ");
		int row = ip.nextInt();
		System.out.println("And, now enter the number of columns you want in your array :- ");
		int col = ip.nextInt();
		int [][] arr = new int[row][col];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
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
	
	public static void rowSum(int [][] arr) {
		int sumrow = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				sumrow += arr[i][j];
			}
			System.out.print(sumrow + " ");
			sumrow = 0;
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for taking input and printing a 2d array...");
		int [][] arr = inputArray(ip);
		System.out.println("So, your entered 2D array is as follows :- ");
		printArray(arr);
		rowSum(arr);
	}

}
