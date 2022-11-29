//Check Array Rotation
//Send Feedback
//You have been given an integer array/list(ARR) of size N. It has been sorted(in increasing order) and then rotated by some 
//number 'K' in the right hand direction.
//Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Output Format :
//For each test case, print the value of 'K' or the index from which which the array/list has been rotated.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1 sec
//Sample Input 1:
//1
//6
//5 6 1 2 3 4
//Sample Output 1:
//2
//Sample Input 2:
//2
//5
//3 6 8 9 10
//4
//10 20 30 1
//Sample Output 2:
//0
//3


import java.util.*;
public class P_74_Check_Array_Rotation {
	
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
	
	public static int checkArrayRotation(int [] arr){
		
		int rotation = 1;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > arr[i-1]){
				rotation++;
			}
			else
				break;
		}
		
		if(rotation == arr.length){
			rotation = 0;
			return rotation;
		}
		else
			return rotation;
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking the number of rotation in your entered array...");
		int [] arr = inputArray(ip);
		System.out.println("So, your entered array is as follows :- ");
		printArray(arr);
		int num = checkArrayRotation(arr);
		System.out.println("So, the rotation in your array is :- " + num);
	}

}
