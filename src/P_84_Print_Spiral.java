//Print Spiral
//Send Feedback
//For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print 
//in the order followed for every iteration:
//a. First row(left to right)
//b. Last column(top to bottom)
//c. Last row(right to left)
//d. First column(bottom to top)
// Mind that every element will be printed only once.
//Refer to the Image:
//Spiral path of a matrix
//
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
//They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
//
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//
//Each of the ith row constitutes 'M' column values separated by a single space.
//Output format :
//For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.
//
//Output for every test case will be printed in a seperate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//4 4 
//1 2 3 4 
//5 6 7 8 
//9 10 11 12 
//13 14 15 16
//Sample Output 1:
//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
//Sample Input 2:
//2
//3 3 
//1 2 3 
//4 5 6 
//7 8 9
//3 1
//10
//20
//30
//Sample Output 2:
//1 2 3 6 9 8 7 4 5 
//10 20 30 


import java.util.*;
public class P_84_Print_Spiral {
	
	public static int [][] inputArray(Scanner ip){
		System.out.println("So, now enter the number of rows you want in your 2D M*N array :- ");
		int row = ip.nextInt();
		System.out.println("So, now enter the number of rows you want in your 2D M*N array :- ");
		int column = ip.nextInt();
		int [][] arr = new int[row][column];
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
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
	
	public static void spiralLikePattern(int [][] arr){
		
		int n = 0;
		int tc = arr.length*arr[0].length;
		int rs = 0, re = arr.length-1, cs = 0, ce = arr[0].length-1;
		while(n < tc){
			
			
			for(int i = cs; n < tc && i <= ce; i++){
				System.out.print(arr[rs][i] + " ");
				n++;
			}
			
			
			rs++;
			for(int i = rs; n < tc && i <= re; i++){
				System.out.print(arr[i][ce] + " ");
				n++;
			}
			
			ce--;
			for(int i = ce; n < tc && i >= cs; i--){
				System.out.print(arr[re][i] + " ");
				n++;
			}
			
			re--;
			for(int i = re; n < tc && i >= rs; i--){
				System.out.print(arr[i][cs] + " ");
				n++;
			}
			cs++;
			
			
		}
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing your 2D array in wave like pattern:- ");
		int [][] arr = inputArray(ip);
		System.out.println("So, your entered 2D array is as follows :- ");
		printArray(arr);
		System.out.println("So, the spiral pattern is as follows :- ");
		spiralLikePattern(arr);
	}

}
