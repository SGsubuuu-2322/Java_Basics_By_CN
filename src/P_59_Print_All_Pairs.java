// This is the program for printing all pairs of your entered numbers in a array.
import java.util.*;
public class P_59_Print_All_Pairs {
	
	public static int[] inputArray(){
		Scanner ip = new Scanner(System.in);
		System.out.println("So, now enter the length of the array :- ");
		int num = ip.nextInt();
		int [] arr = new int[num];
		for(int i = 0; i < num; i++){
			System.out.println("Enter the " + i + "th element of the array :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
		
	}
	public static void printPairs(int [] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				System.out.print("(" + arr[i] + "," + arr[j] + ") ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing all pairs of your entered array...");
		int [] arr = inputArray();
		printPairs(arr);
		
	}

}
