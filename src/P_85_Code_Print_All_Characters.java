import java.util.*;
public class P_85_Code_Print_All_Characters {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing all the characters of the entered string...");
		System.out.println("So, now enter the string :- ");
		String str = ip.nextLine();
		int len = str.length();
		int i = 0;
		while(i < len){
			System.out.print(str.charAt(i) + " ");
			i++;
		}
		

	}

}
