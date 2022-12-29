//Quick Sort - Problem Statement
//Send Feedback
//Sort an array A using Quick Sort.
//Change in the input array itself. So no need to return or print anything.
//
//
//Input format :
//Line 1 : Integer n i.e. Array size
//Line 2 : Array elements (separated by space)
//Output format :
//Array elements in increasing order (separated by space)
//Constraints :
//1 <= n <= 10^3
//Sample Input 1 :
//6 
//2 6 8 5 4 3
//Sample Output 1 :
//2 3 4 5 6 8
//Sample Input 2 :
//5
//1 5 2 7 3
//Sample Output 2 :
//1 2 3 5 7 


import java.util.*;
public class P_128_Quick_Sort_Problem_Statement {
	
	
	
	public static int [] inputArray(Scanner ip){
		System.out.println("So, now enter the length of the array you wanna enter :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		
		for(int i = 0; i < arr.length; i++){
			System.out.println("Enter the element for " + i + "th index :- ");
			arr[i] = ip.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int [] arr){
		System.out.print("{ ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(" }");
		System.out.println();
	}
	
	public static int partition(int [] arr, int si, int ei){
		int pivotElement  = arr[si];
		int count = 0;
		for(int i = si+1; i <= ei; i++){
			if(pivotElement >= arr[i])
				count++;
		}
		
		int pivotIndex = count+si;
		
		int pivot = arr[count+si];
		arr[count+si] = pivotElement;
		arr[si] = pivot;
		
		int i = si, j = ei;
		
		while(i < pivotIndex && j > pivotIndex){
			
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			
			if(i < pivotIndex && j > pivotIndex){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		return pivotIndex;
		
	}
	
	
	public static void quickSort(int [] arr, int si, int ei){
		if(si >= ei)
			return;
		
		int pivotIndex = partition(arr, si, ei);
		quickSort(arr, si, pivotIndex-1);
		quickSort(arr, pivotIndex+1, ei);
	}


	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for sorting your entered unsorted array through quick sort...");
		int [] arr;
		arr = inputArray(ip);
		printArray(arr);
		
		quickSort(arr, 0, arr.length-1);
		printArray(arr);

	}

}
