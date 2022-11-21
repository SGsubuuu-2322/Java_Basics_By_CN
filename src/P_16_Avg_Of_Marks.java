//Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three 
//marks have been given in integer format.
//Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section.
//All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print the integer part of the 
//average only and neglect the decimal part.
//Note: Remember to add the required library/functions for the question.
//
//Input format :
//Line 1 : Name(Single character)
//Line 2 : Marks scored in the 3 tests separated by single space. 
//Output format :
//First line of output prints the name of the student.
//Second line of the output prints the average mark.
//Constraints
//Marks for each student lie in the range 0 to 100 (both inclusive)
//Sample Input 1 :
//A
//3 4 6
//Sample Output 1 :
//A
//4
//Sample Input 2 :
//T
//7 3 8
//Sample Output 2 :
//T
//6



import java.util.*;
public class P_16_Avg_Of_Marks {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating your average marks of three subjects at a time :- ");
		System.out.println("Firstly, enter the first letter of your name :- ");
		char code = ip.next().charAt(0);
		System.out.println("So, enter your marks by giving space one after another, for three subjects :- ");
		int mark_1 = ip.nextInt();
		int mark_2 = ip.nextInt();
		int mark_3 = ip.nextInt();
		int avg_marks = 0;
		avg_marks = (mark_1 + mark_2 + mark_3)/3;
		System.out.println(code);
		System.out.println(avg_marks);

	}

}
