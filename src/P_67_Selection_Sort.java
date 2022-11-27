//Selection Sort
//Send Feedback
//Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
// Note:
//Change in the input array/list itself. You don't need to return or print the elements.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Output format :
//For each test case, print the elements of the array/list in sorted order separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//2 13 4 1 3 6 28
//Sample Output 1:
//1 2 3 4 6 13 28
//Sample Input 2:
//2
//5
//9 3 6 2 0
//4
//4 3 2 1
//Sample Output 2:
//0 2 3 6 9
//1 2 3 4


import java.util.*;
public class P_67_Selection_Sort {
	
	public static int[] inputArray(Scanner ip){
		System.out.println("So, enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the " + i + "th element for array :- ");
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
	
	public static void selectionSort(int [] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program to sort your array in ascending order through selection sort...");
		int [] arr = inputArray(ip);
		System.out.println("So, your entered array before SELECTION SORT :- ");
		printArray(arr);
		System.out.println("And, now after the Selection sort, your array is :- ");
		selectionSort(arr);
		printArray(arr);

	}

}
