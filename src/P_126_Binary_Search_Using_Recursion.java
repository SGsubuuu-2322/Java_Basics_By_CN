import java.util.*;
public class P_126_Binary_Search_Using_Recursion {
	
	public static int index = 0;
	public static boolean binarySearch(int [] arr, int st, int en, int mid, int num){
		if(st == en){
			if(arr[st] == num){
				index = st;
				return true;
			}
			else
				return false;
		}
		
		if(arr[mid] == num){
			index = mid;
			return true;
		}
		else{
			if(arr[mid] >num){
				en = mid-1;
				mid = (st+en)/2;
				return binarySearch(arr, st, en, mid, num);
			}
			else{
				st = mid+1;
				mid = (st+en)/2;
				return binarySearch(arr, st, en, mid, num);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for searching your desired element in your entered array...");
		System.out.println("So,kindly enter the length of your array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter your element no." + i + ":- ");
			arr[i] = ip.nextInt();
		}
		
		System.out.println("So, your entered array is as follows :- ");
		System.out.print("(");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
		
		System.out.println("So, now enter the number you wanna find in your entered array :- ");
		int num = ip.nextInt();
		
		Arrays.sort(arr);
		int st = 0, en = arr.length-1;
		int mid = (st+en)/2;
		boolean res = binarySearch(arr, st, en, mid, num);
		if(res == true)
			System.out.println("Yes, your entered number is present in your entered array at " + index + "th index");
		else
			System.out.println("No, your entered number isn't present in your entered array.");
		

	}

}
