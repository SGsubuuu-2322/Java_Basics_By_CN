//Sort 0 1 2
//Send Feedback
//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
//'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list
//just once.
//Note:
//You need to change in the given array/list itself. Hence, no need to return or print anything. 
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
//Output Format :
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
//0 1 2 0 2 0 1
//Sample Output 1:
//0 0 0 1 1 2 2 
//Sample Input 2:
//2
//5
//2 2 0 1 1
//7
//0 1 2 0 1 2 0
//Sample Output 2:
//0 1 1 2 2 
//0 0 0 1 1 2 2


import java.util.*;
public class P_75_Sort_0_1_2 {
	
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
	
//	public static int [] sortingArray(int [] arr){
//		
//		int zeros = 0, ones = 0, twos = 0;
//		
//		for(int i = 0; i < arr.length; i++){
//			if(arr[i] == 0)
//				zeros++;
//			else if(arr[i] == 1)
//				ones++;
//			else
//				twos++;
//		}
//		
//		int i = 0, j = 0, k = 0;
//		while(i < arr.length){
//			if(i < zeros){
//				arr[i] = 0;
//			}
//			else if(j < ones){
//				arr[i] = 1;
//				j++;
//			}
//			else{
//				arr[i] = 2;
//			}
//			
//			i++;
//		}
//		
//		return arr;
//	}
	
	
//	public static int [] sortingArray(int [] arr){
//		int [] temp = new int[arr.length];
//		int i = 0, j = 0, k = arr.length-1;
//		while(i < arr.length){
//			if(arr[i] == 0){
//				temp[j] = arr[i];
//				j++;
//			}
//			else if(arr[i] == 2){
//				temp[k] = arr[i];
//				k--;
//			}
//			
//			i++;
//				
//		}
//		
//		i = j;
//		int l = k;
//		while(i <= l){
//			temp[i] = 1;
//			i++;
//		}
//		
//		int n = 0;
//		while(n < arr.length){
//			arr[n] = temp[n];
//			n++;
//		}
//		
//		return arr;
//	}
	
	
	public static int [] sortingArray(int [] arr){
		
		int i = 0, nz = 0, nt = arr.length-1;
		while(i <= nt){
			if(arr[i] == 0){
				int temp = arr[nz];
				arr[nz] = arr[i];
				arr[i] = temp;
				nz++;
				i++;
			}
			else if(arr[i] == 2){
				int temp = arr[nt];
				arr[nt] = arr[i];
				arr[i] = temp;
				nt--;
			}
			else
				i++;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for sorting your entered array(0's, 1's, and 2's) in increasing order...");
	    int [] arr = inputArray(ip);
	    System.out.println("So, your entered array is as follows :- ");
	    printArray(arr);
	    System.out.println("And, after sorting your array as follows :- ");
	    sortingArray(arr);
	    printArray(arr);
	    
	}

}
