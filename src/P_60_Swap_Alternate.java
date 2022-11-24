//Swap Alternate
//Send Feedback
//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.
//You don't need to print or return anything, just change in the input array itself.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Output Format :
//For each test case, print the elements of the resulting array in a single row separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1sec
//Sample Input 1:
//1
//6
//9 3 6 12 4 32
//Sample Output 1 :
//3 9 12 6 32 4
//Sample Input 2:
//2
//9
//9 3 6 12 4 32 5 11 19
//4
//1 2 3 4
//Sample Output 2 :
//3 9 12 6 32 4 11 5 19 
//2 1 4 3 


import java.util.*;
public class P_60_Swap_Alternate {
	
	public static int[] inputArray(){
		Scanner ip = new Scanner(System.in);
		System.out.println("So, enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < len; i++){
			System.out.println("Now, enter the " + i + "th element :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int [] arr){
		int temp1 = 1, temp2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(temp1 % 2 != 0 && temp1 < (arr.length)){
				temp2 = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp2;
			}
			temp1++;
		}
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing your entered array by swapping the alternate elements...");
		int [] arr = inputArray();
		printArray(arr);
	}

}
