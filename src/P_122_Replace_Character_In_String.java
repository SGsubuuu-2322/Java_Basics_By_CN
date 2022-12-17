import java.util.*;
public class P_122_Replace_Character_In_String {
	
	public static String replaceChar(String str, char r1, char r2){
		if(str.length() == 0)
			return str;
		String smallStr = replaceChar(str.substring(1), r1, r2);
		if(str.charAt(0) == r1)
			return r2 + smallStr;
		else
			return str.charAt(0) + smallStr;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for replacing with your desired character in your entered String...");
		System.out.println("So, enter a String :- ");
		String str = ip.nextLine();
		int count = str.length();
		System.out.println("So, enter the character you wanna replace in your String :- ");
		char r1 = ip.next().charAt(0);
		System.out.println("And, now enter the character you wanna be replaced instead of old character :- ");
		char r2 = ip.next().charAt(0);
		System.out.print("So, after replacing your resultant string is as follows :- ");
		System.out.print(replaceChar(str, r1, r2));

	}

}
