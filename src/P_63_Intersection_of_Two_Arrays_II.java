//Intersection of Two Arrays II
//Send Feedback
//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
//You need to print their intersection; An intersection for this problem can be defined when both 
//the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
//Note :
//Input arrays/lists can contain duplicate elements.
//
//The intersection elements printed would be in the order they appear in the first array/list(ARR1)
//
//
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//Second line contains 'N' single space separated integers representing the elements of the first the array/list.
//
//Third line contains an integer 'M' representing the size of the second array/list.
//
//Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
//Output format :
//For each test case, print the intersection elements in a row, separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//0 <= M <= 10^3
//Time Limit: 1 sec 
//Sample Input 1 :
//2
//6
//2 6 8 5 4 3
//4
//2 3 4 7 
//2
//10 10
//1
//10
//Sample Output 1 :
//2 4 3
//10
//Sample Input 2 :
//1
//4
//2 6 1 2
//5
//1 2 3 4 2
//Sample Output 2 :
//2 1 2
//Explanation for Sample Output 2 :
//Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. 
//The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches
//with the second '2' if the second array.


import java.util.*;
public class P_63_Intersection_of_Two_Arrays_II {
	public static int[] inputArray(Scanner ip){
		System.out.println("So, now enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the " + i + "th element :- ");
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
	
	public static void findIntersection(int [] arr1, int[] arr2){
		int temp1 = 0, flag = 1;
		for(int i = 0; i < arr1.length; i++){
			for(int j = 0; j < arr2.length; j++){
				if(arr1[i] == arr2[j]){
					flag = -1;
					temp1 = arr1[i];
					arr2[j] = Integer.MIN_VALUE;
					break;
				}
			}
			if(flag == -1)
				System.out.print(temp1 + " ");
			flag = 1;
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the intersections between two arrays...");
		System.out.println("So, now enter your 1st array :- ");
		int [] arr1 = inputArray(ip);
		System.out.println("And, now enter your second array :- ");
		int [] arr2 = inputArray(ip);
		printArray(arr1);
		printArray(arr2);
		findIntersection(arr1, arr2);
		

	}

}
