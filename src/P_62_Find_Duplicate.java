//Find Duplicate
//Send Feedback
//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. 
//That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice.
//You need to find and return that duplicate number present in the array.
//Note :
//Duplicate number is always present in the given array/list.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Output Format :
//For each test case, print the duplicate element in the array/list.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1 sec
//Sample Input 1:
//1
//9
//0 7 2 5 4 7 1 3 6
//Sample Output 1:
//7
//Sample Input 2:
//2
//5
//0 2 1 3 1
//7
//0 3 1 5 4 3 2
//Sample Output 2:
//1
//3



import java.util.*;
public class P_62_Find_Duplicate {
	public static int[] inputArray(Scanner ip){
		System.out.println("So, enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the " + i + "th element for your array :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}
	public static void printArray(int [] arr){
		System.out.print("( ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(" )");
		System.out.println();
	}
	public static void findDuplicateElement(int [] arr){
		int temp1 = 0, temp2 = -1;
		for(int i = 0; i < arr.length; i++){
			temp1 = arr[i];
			for(int j = 0; j < arr.length; j++){
				if(j == i)
					continue;
				else{
					if(temp1 == arr[j]){
						temp2 = 1;
						break;
					}
				}
			}
			if(temp2 == 1)
				break;
			temp2 = -1;
		}
		System.out.println(temp1);
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding out a duplicate number in your entered array...");
		int [] arr = inputArray(ip); 
		printArray(arr);
		findDuplicateElement(arr);
	}

}
