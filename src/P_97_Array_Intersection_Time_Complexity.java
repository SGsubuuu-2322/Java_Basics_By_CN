//Array Intersection
//Send Feedback
//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
//You need to print their intersection; An intersection for this problem can be defined when both 
//the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
//Note :
//Input arrays/lists can contain duplicate elements.
//
//The intersection elements printed would be in ascending order.
//
//
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//The second line contains 'N' single space separated integers representing the elements of the first the array/list.
//
//The third line contains an integer 'M' representing the size of the second array/list.
//
//The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
//Output format :
//For each test case, print the intersection elements in a row, separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^6
//0 <= M <= 10^6
//
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
//2 3 4
//10
//Sample Input 2 :
//1
//4
//2 6 1 2
//5
//1 2 3 4 2
//Sample Output 2 :
//1 2 2
//Explanation for Sample Output 2 :
//Since, both input arrays have two '2's, the intersection of the arrays also have two '2's.
//The first '2' of first array matches with the first '2' of the second array. Similarly, the 
//second '2' of the first array matches with the second '2' if the second array.



import java.util.*;
public class P_97_Array_Intersection_Time_Complexity {
	
	
	public static int [] inputArray(Scanner ip, int no) {
		System.out.println("So, now enter the length of your array" + no + " :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the " + i + "th element :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int [] arr) {
		System.out.print("(");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
	}
	
	public static void interSection(int [] arr1, int [] arr2){
		int len_A = arr1.length;
		int len_B = arr2.length;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0;
		while(i < len_A && j < len_B){
			if(arr1[i] == arr2[j]){
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
			else if(arr1[i] > arr2[j]){
				j++;
			}
			else if(arr1[i] < arr2[j]){
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding the intersection between your two entered arrays :- ");
		int [] arr1 = inputArray(ip, 1);
		int [] arr2 = inputArray(ip, 2);
		System.out.println("So, this is your entered 1st array :- ");
		printArray(arr1);
		System.out.println("And, this is your entered 2nd array :- ");
		printArray(arr2);
		System.out.println("So, the intersections are :- ");
		interSection(arr1, arr2);
		

	}

}
