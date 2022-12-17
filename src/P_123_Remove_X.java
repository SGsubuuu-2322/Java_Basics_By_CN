//Remove X
//Send Feedback
//Given a string, compute recursively a new string where all 'x' chars have been removed.
//Input format :
//String S
//Output format :
//Modified String
//Constraints :
//1 <= |S| <= 10^3
//where |S| represents the length of string S. 
//Sample Input 1 :
//xaxb
//Sample Output 1:
//ab
//Sample Input 2 :
//abc
//Sample Output 2:
//abc
//Sample Input 3 :
//xx
//Sample Output 3:
//



import java.util.*;
public class P_123_Remove_X {
	
	public static String removeX(String str){
		if(str.length() == 0)
			return str;
		
		if(str.charAt(0) == 'x')
			return str.substring(1);
		else
			return str.charAt(0)+removeX(str.substring(1));
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for removing x from your entered String....");
		System.out.println("So, enter a String :- ");
		String str = ip.nextLine();
		System.out.println(removeX(str));
	}

}
