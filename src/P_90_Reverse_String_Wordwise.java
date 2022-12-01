//Reverse String Wordwise
//Send Feedback
//Reverse the given string word wise. That is, the last word in given string should come at 1st place, last 
//second word at 2nd place and so on. Individual words should remain as it is.
//Input format :
//String in a single line
//Output format :
//Word wise reversed string in a single line
//Constraints :
//0 <= |S| <= 10^7
//where |S| represents the length of string, S.
//Sample Input 1:
//Welcome to Coding Ninjas
//Sample Output 1:
//Ninjas Coding to Welcome
//Sample Input 2:
//Always indent your code
//Sample Output 2:
//code your indent Always



import java.util.*;
public class P_90_Reverse_String_Wordwise {
	
	public static void revString(String str){
		int len = str.length();
		String revstr = "";
		int i = 0;
		int j = 0;
		while(i < len){
			if(str.charAt(i) == ' '){
				revstr = str.substring(j ,i+1) + revstr;
				j = i;
			}
			else if(i == len-1){
				revstr = str.substring(j+1 ,i+1) + revstr;
				j = i;
			}
			i++;
		}
		
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing your in reverse manner in wordwise :- ");
		System.out.println("Enter a string :- ");
		String str = ip.nextLine();
		revString(str);

	}

}
