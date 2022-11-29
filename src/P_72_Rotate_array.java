//Rotate array
//Send Feedback
//You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given 
//array/list by D elements(towards the left).
// Note:
//Change in the input array/list itself. You don't need to return or print the elements.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//
//Third line contains the value of 'D' by which the array/list needs to be rotated.
//Output Format :
//For each test case, print the rotated array/list in a row separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^4
//0 <= N <= 10^6
//0 <= D <= N
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//1 2 3 4 5 6 7
//2
//Sample Output 1:
//3 4 5 6 7 1 2
//Sample Input 2:
//2
//7
//1 2 3 4 5 6 7
//0
//4
//1 2 3 4
//2
//Sample Output 2:
//1 2 3 4 5 6 7
//3 4 1 2



import java.util.*;
public class P_72_Rotate_array {
	
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
	
	public static int[] rotatedArray(int [] arr, Scanner ip){
		
		System.out.println("So, now enter the number by which the array will be rotated :- ");
		int num = ip.nextInt();
		for(int i = 0; i < num; i++){
			int temp = arr[0];
			for(int j = 1; j < arr.length; j++){
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		
		return arr;
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for rotating your a certain entered number by you...");
		int [] arr = inputArray(ip);
		System.out.println("So, your entered array is as follows :- ");
		printArray(arr);
		arr = rotatedArray(arr, ip);
		System.out.println("After rotation by your entered number your array is as follows :- ");
		printArray(arr);

	}

}
