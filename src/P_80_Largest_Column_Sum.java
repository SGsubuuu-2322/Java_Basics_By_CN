import java.util.*;
public class P_80_Largest_Column_Sum {
	
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
	
	public static void largestColumnSum(int [][] arr){
		int largcolsum = Integer.MIN_VALUE, col_sum = 0;
		for(int i = 0; i < arr[0].length; i++){
			for(int j = 0; j < arr.length; j++){
				col_sum += arr[j][i];
			}
			System.out.print(col_sum + " ");
			if(largcolsum < col_sum)
				largcolsum = col_sum;
			col_sum = 0;
				
			
		}
		System.out.println("So, the largest column sum is : " + largcolsum);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for taking input and printing a 2d array...");
		int [][] arr = inputArray(ip);
		System.out.println("So, your entered 2D array is as follows :- ");
		printArray(arr);
		largestColumnSum(arr);

	}

}
