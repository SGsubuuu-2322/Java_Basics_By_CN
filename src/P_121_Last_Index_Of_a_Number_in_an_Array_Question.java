//Last Index Of a Number in an Array - Question
//Send Feedback
//Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array.
//Return -1 if it is not present in the array.
//Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
//You should start traversing your array from 0, not from (N - 1).
//Do this recursively. Indexing in the array starts from 0.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Line 3 : Integer x
//Output Format :
//last index or -1
//Constraints :
//1 <= N <= 10^3
//Sample Input :
//4
//9 8 10 8
//8
//Sample Output :
//3



import java.util.*;
public class P_121_Last_Index_Of_a_Number_in_an_Array_Question {
	
	
	public static int [] ipOpArr(Scanner ip){
		System.out.println("So, kindly enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("So, please enter the " + i + "th element of your array :- ");
			arr[i] = ip.nextInt();
		}
		System.out.println("So, your entered array is as follows :- ");
		System.out.print("(");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
		return arr;
	}
	
	public static int index = -1;
	public static int findLastIndex(int [] arr, int count, int num){
		if(count == arr.length-1){
			if(arr[count] == num){
				return count;
			}
			else
				return index;
		}
		
		if(arr[count] == num){
			index = count;
		}
		
		index = findLastIndex(arr, count + 1, num);
		
		return index;
	}
	

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding , your entered array is sorted or not...");
		int [] arr = ipOpArr(ip);
		System.out.println("So, now enter the number for whose first appearance you want :- ");
		int num = ip.nextInt();
		int res = findLastIndex(arr, 0, num);
        System.out.println("So, the first index of your entered number in your entered array is : " + res);

	}

}
