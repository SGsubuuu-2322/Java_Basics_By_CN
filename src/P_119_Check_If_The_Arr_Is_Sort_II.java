import java.util.Scanner;
import java.util.*;
public class P_119_Check_If_The_Arr_Is_Sort_II {
	
	
	public static int [] ipOpArr(Scanner ip){
		System.out.println("So, kindly enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("So, please enter the " + i + "th element of your array :- ");
			arr[i] = ip.nextInt();
		}
		System.out.println("So, your entered array is as follows :- ");
		System.out.print("(");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
		return arr;
	}
	
	public static boolean isSorted(int [] arr, int count){
		boolean res = true;
		if(count <= arr.length-2){
			if(arr[count] > arr[count+1])
				return false;
			
			res = isSorted(arr, count+1);
			
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding , your entered array is sorted or not...");
		int [] arr = ipOpArr(ip);
		boolean res = isSorted(arr, 0);
		if(res == true)
			System.out.println("Yes, your array is sorted.");
		else
			System.out.println("No, your isn't sorted.");

	}

}
