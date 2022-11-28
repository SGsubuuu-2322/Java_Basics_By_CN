//Code Merge Two Sorted Arrays
//Send Feedback
//You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such 
//that the third array is also sorted.
//Input Format :
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
//For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//0 <= M <= 10^5
//Time Limit: 1 sec 
//Sample Input 1 :
//1
//5
//1 3 4 7 11
//4
//2 4 6 13
//Sample Output 1 :
//1 2 3 4 4 6 7 11 13 
//Sample Input 2 :
//2
//3
//10 100 500
//7
//4 7 9 25 30 300 450
//4
//7 45 89 90
//0
//Sample Output 2 :
//4 7 9 10 25 30 100 300 450 500
//7 45 89 90


import java.util.*;
public class p_70_Code_Merge_Two_Sorted_Arrays {
	
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
	
//	public static int [] mergedArray(int [] arr1, int [] arr2){
//		int len_sum = arr1.length + arr2.length;
//		int min_len = 0;
//		if(arr1.length < arr2.length)
//			min_len = arr1.length;
//		else
//			min_len = arr2.length;
//		int [] arr3 = new int[len_sum];
//		for(int i = 0; i < arr1.length; i++){
//			arr3[i] = arr1[i];
//		}
//		for(int i = arr1.length, inc = 0; i < arr3.length; i++, inc++){
//			arr3[i] = arr2[inc];
//		}
//		
//		for(int i = 1; i < arr3.length; i++){
//			
//			int temp = arr3[i], j = i-1;
//			while(j >= 0 && temp < arr3[j]){
//				arr3[j+1] = arr3[j];
//				j--;
//			}
//			arr3[j+1] = temp;
//		}
//		
//		return arr3;
//	}
	
	
	public static int [] mergedArray(int [] arr1, int [] arr2){
		int num=arr1.length+arr2.length;
        int arr3[]=new int[num];
    	int i=0,j=0,k=0;
        if(arr1.length==0)
        {
         return arr2;
        }if(arr2.length==0)
        {
         return arr1;
        }
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                
                arr3[k]=arr2[j];
                j++;
                k++;
            }
      }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;}
        
        while(j<arr2.length){
            //if(i<arr1.length){
            arr3[k]=arr2[j];
            j++;
            k++;
            }
        return arr3;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for merging two sorting arrays entered by you...");
		int [] arr1 = inputArray(ip, 1);
		int [] arr2 = inputArray(ip, 2);
		System.out.println("So, this is your entered 1st array :- ");
		printArray(arr1);
		System.out.println("And, this is your entered 2nd array :- ");
		printArray(arr2);
		System.out.println("So, now comes your merged and sorted arrays :- ");
		int [] arr3 = mergedArray(arr1, arr2);
		printArray(arr3);

	}

}
