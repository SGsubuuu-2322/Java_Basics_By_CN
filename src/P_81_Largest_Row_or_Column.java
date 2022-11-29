//Largest Row or Column
//Send Feedback
//For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the 
//largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
//Note :
//If there are more than one rows/columns with maximum sum, consider the row/column that comes first. 
//And if ith row and jth column has the same largest sum, consider the ith row as answer.
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
//For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
//OR
//If column sum is maximum, then print: "column" <col_index> <col_sum>
//It will be printed in a single line separated by a single space between each piece of information.
//
//Output for every test case will be printed in a seperate line.
// Consider :
//If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1 :
//1
//2 2 
//1 1 
//1 1
//Sample Output 1 :
//row 0 2
//Sample Input 2 :
//2
//3 3
//3 6 9 
//1 4 7 
//2 8 9
//4 2
//1 2
//90 100
//3 40
//-10 200
//Sample Output 2 :
//column 2 25
//column 1 342



import java.util.*;
public class P_81_Largest_Row_or_Column {
	
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
	
	public static void largestRowColumnSum(int [][] arr){
		
		int larg_row_sum = Integer.MIN_VALUE, larg_col_sum = Integer.MIN_VALUE, r_index = 0, c_index = 0;
		int row_sum = 0, col_sum = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				row_sum += arr[i][j];
			}
			if(larg_row_sum < row_sum){
				larg_row_sum = row_sum;
				r_index = i;
			}
			row_sum = 0;
		}
		
		for(int i = 0; i < arr[0].length; i++){
			for(int j = 0; j < arr.length; j++){
				col_sum += arr[j][i];
			}
			if(larg_col_sum < col_sum){
				larg_col_sum = col_sum;
				c_index = i;
			}
			col_sum = 0;
		}
		
		if(larg_row_sum > larg_col_sum){
			System.out.println("So, the largest sum is of Row : " + r_index + "th = " + larg_row_sum);
		}
		else if(larg_col_sum > larg_row_sum){
			System.out.println("So, the largest sum is of Column : " + c_index + "th = " + larg_col_sum);
		}
		else {
			System.out.println("So, the largest sum is of Row : " + r_index + "th = " + larg_row_sum);
		}
		
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for taking input and printing a 2d array...");
		int [][] arr = inputArray(ip);
		System.out.println("So, your entered 2D array is as follows :- ");
		printArray(arr);
		largestRowColumnSum(arr);

	}

}
