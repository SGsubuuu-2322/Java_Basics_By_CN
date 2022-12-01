import java.util.*;
public class P_87_Reverse_A_String {
	
	public static String reverseString(String str){
		
		String revstr = "";
		int len = str.length();
//		for(int i = len-1; i >= 0; i--){
//			revstr +=  str.charAt(i);
//		}
		
		for(int i = 0; i < len; i++){
			revstr = str.charAt(i) +  revstr;
		}
		
		return revstr;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for reversing a string...");
		System.out.println("So, enter a string which you wanna be reversed :- ");
		String str = ip.nextLine();
		String rstr = reverseString(str);
		System.out.println(rstr);

	}

}
