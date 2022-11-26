//Sort 0 1
//Send Feedback
//You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list.
//Think of a solution which scans the array/list only once and don't require use of an extra array/list.
//Note:
//You need to change in the given array/list itself. Hence, no need to return or print anything. 
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers(all 0s and 1s) representing the elements in the array/list.
//Output format :
//For each test case, print the sorted array/list elements in a row separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//0 1 1 0 1 0 1
//Sample Output 1:
//0 0 0 1 1 1 1
//Sample Input 2:
//2
//8
//1 0 1 1 0 1 0 1
//5
//0 1 0 1 0
//Sample Output 2:
//0 0 0 1 1 1 1 1
//0 0 0 1 1 

import java.util.*;
public class P_66_Sort_0_1 {

	public static int[] inputArray(Scanner ip){
		System.out.println("So, now enter the length of your array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		System.out.println("So, you'hv to enter all your elements in 0's and 1's in your array...");
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter your " + i + "th element :- ");
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
	public static void arraySort(int [] arr){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 1){
				for(int j = arr.length-1; j > i; j--){
					if(arr[j] == 0){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.print("(");
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
	}
	public static void main(String[] args) {
		System.out.println("This is the program for sorting 0 and 1 in your entered 0 and 1 array...");
		Scanner ip = new Scanner(System.in);
		int [] arr = inputArray(ip);
		printArray(arr);
		arraySort(arr);

	}

}
