import java.util.*;
public class P_127_Merge_Sort_Problem_Statement {
	
	public static void mergeArrays(int [] arrB, int [] arrC, int [] arrA){
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arrB.length && j < arrC.length){
			if(arrB[i] < arrC[j]){
				arrA[k] = arrB[i];
				k++;
				i++;
			}
			else{
				arrA[k] = arrC[j];
				k++;
				j++;
			}
		}
		
		while(i < arrB.length){
			arrA[k] = arrB[i];
			i++;
			k++;
		}
		while(j < arrC.length){
			arrA[k] = arrC[j];
			k++;
			j++;
		}
//		printArray(arrA);
	}
	
	public static void mergeSort(int [] arrA){
		if(arrA.length <= 1)
			return;
		
		int [] arrB = new int[arrA.length/2];
		int [] arrC = new int[arrA.length - arrB.length];
		
		for(int i = 0; i < arrB.length; i++){
			arrB[i] = arrA[i];
		}
//		printArray(arrB);
		
		for(int i = arrB.length, j = 0; i < arrA.length; i++, j++){
			arrC[j] = arrA[i];
		}
//		printArray(arrC);
		
		mergeSort(arrB);
		mergeSort(arrC);
		
		mergeArrays(arrB, arrC, arrA);
	}
	
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

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for sorting and printing your unsorted entered array through Merge-Sort...");
		
		int [] arr;
		arr = inputArray(ip);
		printArray(arr);
		
		mergeSort(arr);
		System.out.println("So, after doing merge sort to your entered array, your array will be like :- ");
		System.out.print("{ ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
			
		}
		System.out.print(" }");

	}

}
