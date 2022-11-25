//Find Unique
//Send Feedback
//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//You need to find and return that number which is unique in the array/list.
// Note:
//Unique element is always present in the array/list according to the given condition.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers representing the elements in the array/list.
//Output Format :
//For each test case, print the unique element present in the array.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^3
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//2 3 1 6 3 6 2
//Sample Output 1:
//1
//Sample Input 2:
//2
//5
//2 4 7 2 7
//9
//1 3 1 3 6 6 7 10 7
//Sample Output 2:
//4
//10


import java.util.*;
public class P_61_Find_Unique {
	public static int[] inputArray(Scanner ip){
		System.out.println("So, enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int [len];
		for(int i = 0; i < len; i++){
			System.out.println("So, enter the " + i + "th element :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}
	public static void findUniqueElement(int [] arr){
		int temp1 = 0, temp2 = 1;
		for(int i = 0; i < arr.length; i++){
			temp1 = arr[i];
			for(int j = 0; j < arr.length; j++){
				if(j == i)
					continue;
				else{
					if(temp1 == arr[j]){
						temp2 = -1;
						break;
					}
				}
			}
			
			if(temp2 == 1)
				break;
			temp2 = 1;
		}
		System.out.println(temp1);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing the unique number or element present in your entered array...");
		int [] arr = inputArray(ip);
		findUniqueElement(arr);
	}

}
