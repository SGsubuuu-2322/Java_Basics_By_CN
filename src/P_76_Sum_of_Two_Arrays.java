//Sum of Two Arrays
//Send Feedback
//Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain 
//numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an 
//integer in itself of digits N and M.
//You need to find the sum of both the input arrays/list treating them as two integers and put the result in another 
//array/list i.e. output array/list will also contain only single digit at every index.
//Note:
//The sizes N and M can be different. 
//
//Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list.
//Place 0 at the 0th index if there is no carry. 
//
//No need to print the elements of the output array/list.
//Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. 
//The main code will handle the printing of the output on its own.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//Second line contains 'N' single space separated integers representing the elements of the first array/list.
//
//Third line contains an integer 'M' representing the size of the second array/list.
//
//Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
//Output Format :
//For each test case, print the required sum of the arrays/list in a row, separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//0 <= M <= 10^5
//Time Limit: 1 sec 
//Sample Input 1:
//1
//3
//6 2 4
//3
//7 5 6
//Sample Output 1:
//1 3 8 0
//Sample Input 2:
//2
//3
//8 5 2
//2
//1 3
//4
//9 7 6 1
//3
//4 5 9
//Sample Output 2:
//0 8 6 5
//1 0 2 2 0 



import java.util.*;
public class P_76_Sum_of_Two_Arrays {
	
	public static int[] inputArray(Scanner ip, int num){
		System.out.println("So, now enter the length of your array-" + num + " :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, enter the " + i + "th element for your array-" + num + " :- ");
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
	
	public static int[] addingArrays(int [] arr1, int [] arr2){
		int max_len = 0;
		if(arr1.length > arr2.length){
			max_len = arr1.length;
		}
		else if(arr2.length > arr1.length){
			max_len = arr2.length;
		}
		else if(arr1.length == arr2.length){
			max_len = arr1.length;
		}
		
		int [] arr3 = new int[max_len + 1];
		int carry = 0, i = arr1.length - 1, j = arr2.length - 1, k = arr3.length - 1, sum = 0, final_Res = 0;
		
		
		while(i >= 0  && j >= 0){
			sum = arr1[i] + arr2[j] + carry;
			carry = sum/10;
			final_Res = sum % 10;
			i--;
			j--;
			arr3[k] = final_Res;
			k--;
		}
		
		while(i >= 0){
			arr3[k] = arr1[i];
			i--;
			k--;
		}
		
		while(j >= 0){
			arr3[k] = arr2[j];
			j--;
			k--;
			
		}
		
		return arr3;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for adding and showing  indices of two arrays in normal addition...");
	    int [] arr1 = inputArray(ip, 1);
	    int [] arr2 = inputArray(ip, 2);
	    System.out.println("So, your entered arrays is as follows :- ");
	    printArray(arr1);
	    printArray(arr2);
	    System.out.println("And, after adding both of  your arrays the resultant array is as follows :- ");
	    int [] arr3 = addingArrays(arr1, arr2);
	    printArray(arr3);
	}

}
