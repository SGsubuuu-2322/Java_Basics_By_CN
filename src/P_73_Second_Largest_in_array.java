//Second Largest in array
//Send Feedback
//You have been given a random integer array/list(ARR) of size N. You are required to find and return the
//		second largest element present in the array/list.
//If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//The second line contains 'N' single space separated integers representing the elements in the array/list.
//Output Format :
//For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//2 13 4 1 3 6 28
//Sample Output 1:
//13
//Sample Input 2:
//1
//5
//9 3 6 2 9
//Sample Output 2:
//6
//Sample Input 3:
//2
//2
//6 6
//4
//90 8 90 5
//Sample Output 3:
//-2147483648
//8


import java.util.*;
public class P_73_Second_Largest_in_array {
	
	public static int[] inputArray(Scanner ip){
		System.out.println("So, now enter the length of your array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the " + i + "th element for your array :- ");
			arr[i] = ip.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int [] arr){
		System.out.print("(");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
	}
	
	public static int secondLargest(int [] arr, Scanner ip){
		
		int flarg = Integer.MIN_VALUE, secLarg = 0;
		for(int i = 0; i < arr.length; i++){
			if(flarg < arr[i]){
				int temp = flarg;
				flarg = arr[i];
				secLarg = temp;
				
			}
		}
		
		
		return secLarg;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding out the second largest number in your array...");
		int [] arr = inputArray(ip);
		System.out.println("So, your entered array is as follows :- ");
		printArray(arr);
		int num = secondLargest(arr, ip);
		System.out.println("The second largest number in your entered array is : " + num);

	}

}
