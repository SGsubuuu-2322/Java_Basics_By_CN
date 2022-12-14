package Fraction_Substraction_Class_2;
import java.util.*;

public class Fraction_Substraction_Execution_Class {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the substraction for your two entered fractions...");
		System.out.println("So, now enter the number for numerator for fraction 1 :- ");
		int nume1 = ip.nextInt();
		System.out.println("And, now enter the number for denomenator for fraction1 :- ");
		int deno1 = ip.nextInt();
		if(deno1 == 0)
			deno1 = 1;
		Fraction_Substraction_Business_Class fracSub1 = new Fraction_Substraction_Business_Class(nume1, deno1);
		
		
		
		System.out.println("And, now enter the number for numerator for fraction2 :- ");
		int nume2 = ip.nextInt();
		System.out.println("Lastly, enter the number for denomenator for fraction2 :- ");
		int deno2 = ip.nextInt();
		if(deno2 == 0)
			deno2 = 1;
		Fraction_Substraction_Business_Class fracSub2 = new Fraction_Substraction_Business_Class(nume2, deno2);
		
		fracSub1.subsTract(fracSub2);
		System.out.println("And, the result after Fraction-Substraction is as follows :- ");
		fracSub1.print();
		
		
	}

}
