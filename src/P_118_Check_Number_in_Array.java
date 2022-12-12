//Check Number in Array
//Send Feedback
//Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
//Do this recursively.
//Input Format :
//Line 1 : An Integer N i.e. size of array
//Line 2 : N integers which are elements of the array, separated by spaces
//Line 3 : Integer x
//Output Format :
//'true' or 'false'
//Constraints :
//1 <= N <= 10^3
//Sample Input 1 :
//3
//9 8 10
//8
//Sample Output 1 :
//true
//Sample Input 2 :
//3
//9 8 10
//2
//Sample Output 2 :
//false



import java.util.*;
public class P_118_Check_Number_in_Array {
	
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
	

	
	public static boolean findNumber(int [] arr, int num, int count){
		boolean res = false;
		if(count >= 0){
			if(arr[count] == num){
				return true;
			}
			
			res = findNumber(arr, num, count-1);
			return res;
			
		}
		return res;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for finding your entered number in your entered array...");
		int [] arr = ipOpArr(ip);
		System.out.println("Now, enter the number your wanna search :- ");
		int num = ip.nextInt();
		boolean res = findNumber(arr, num, arr.length-1);
		if(res == true)
			System.out.println("Yes, it is present in your entered array.");
		else
			System.out.println("No, it isn't present in your entered array.");
	}

}
