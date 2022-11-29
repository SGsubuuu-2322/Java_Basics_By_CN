import java.util.*;
public class P_78_Ip_and_Op_Of_2DA_Col {
	
	public static int [][] ipopArray(Scanner ip){
		System.out.println("So, now enter the no. of rows you want in your array :- ");
		int row = ip.nextInt();
		System.out.println("So, now enter the no. of columns you want in your array :- ");
		int col = ip.nextInt();
		int [][] arr = new int [row][col];
		for(int i = 0; i < col; i++){
			for(int j = 0; j < row; j++){
				System.out.println("Now, enter the " + j + "th row and " + i + "th col :- ");
				arr[j][i] = ip.nextInt();
			}
		}
		
		
		for(int i = 0; i < col; i++){
			for(int j = 0; j < row; j++){
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
		return arr;
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for taking input of a 2d array in columnwise manner...");
		int [][] arr = ipopArray(ip);

	}

}
