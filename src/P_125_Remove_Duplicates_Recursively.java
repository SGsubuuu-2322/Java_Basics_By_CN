import java.util.*;
public class P_125_Remove_Duplicates_Recursively {
	
	public static String replaceCon(String str){
		if(str.length() <= 1)
			return str;
		
		String smallStr = replaceCon(str.substring(1));
		if(str.charAt(0) == smallStr.charAt(0)){
			return smallStr;
		}
		else{
			return (str.charAt(0)+smallStr);
		}
		
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for removing consecutive duplicate elements from your entered string...");
		System.out.println("So, kindly enter your string:- ");
		String str = ip.next();
		String newStr = replaceCon(str);
		System.out.println(newStr);

	}

}
