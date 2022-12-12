//Sum Of Array
//Send Feedback
//Given an array of length N, you need to find and return the sum of all elements of the array.
//Do this recursively.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Output Format :
//Sum
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 9
//Sample Output 1 :
//26
//Sample Input 2 :
//3
//4 2 1
//Sample Output 2 :
//7    





import java.util.*;
public class P_116_Sum_Of_Array {

	public static int [] ipOpArray(Scanner ip){
		System.out.println("So, kindly enter the length of the array :- ");
		int len = ip.nextInt();
		int [] arr = new int[len];
		for(int i = 0; i < arr.length; i++){
			System.out.println("Now, kindly enter the element for " + i + "th index :- ");
			arr[i] = ip.nextInt();
		}
		System.out.println("So, this is your entered array :- ");
		System.out.print("(");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.print(")");
		System.out.println();
		return arr;
	}
	
	public static void calcSumArr(int [] arr, int count){
		if(count == 0){
			sum += arr[count];
			return;
		}
		
		calcSumArr(arr, count-1);
		sum += arr[count];
		
	}
	
	public static int sum = 0;
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the sum of all the elements of your entered array :- ");
		int [] arr = ipOpArray(ip);
		calcSumArr(arr, arr.length-1);
		System.out.println("So, the total sum is your entered array is : " + sum);
	}

}
