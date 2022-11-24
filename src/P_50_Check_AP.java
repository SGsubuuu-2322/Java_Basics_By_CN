//Check AP
//Send Feedback
//Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
//Input format :
//Line 1 : n
//Line 2 : n numbers
//Sample Input 1 :
//6
//2 6 10 14 18 22
//Sample Output 1 :
//true
//Sample Input 2 :
//6
//2 6 10 15 19 23
//Sample Output 2 :
//false



import java.util.*;
public class P_50_Check_AP {
	
	
	public static boolean isAp(int arr[], int num){
		int diff = arr[1] - arr[0];
		for(int i = 2; i < num; i++){
			if((arr[i] - arr[i-1]) != diff)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for checking entered series is a ap series or not...");
		System.out.println("So, enter how many numbers you want to enter :- ");
		int num = ip.nextInt();
		int [] arr = new int [num];
		System.out.println("So, now entered the numbers :- ");
		for(int i = 0; i < num; i++)
			arr[i] = ip.nextInt();
		if(isAp(arr, num))
			System.out.println("Your entered numbers is a AP series...");
		else
			System.out.println("Your entered numbers are not in AP series...");
		
		
	}

}
