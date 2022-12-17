import java.util.*;
public class P_124_Remove_Pi {
	
	public static String removePi(String str){
		if(str.length() <= 1)
			return str;
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
			String smallstr = removePi(str.substring(2));
			return ("3.14" + smallstr);
		}
		else{
			String smallstr = removePi(str.substring(1));
			return str.charAt(0)+smallstr;
		}
			
			
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for replacing \"pi\" in your entered string by 3.14...");
		System.out.println("So. kindly enter your string :- ");
		String str = ip.nextLine();
		String replacedStr = removePi(str);
		System.out.println(replacedStr);

	}

}
