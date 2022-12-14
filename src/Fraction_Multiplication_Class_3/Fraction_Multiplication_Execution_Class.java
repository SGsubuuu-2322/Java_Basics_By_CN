package Fraction_Multiplication_Class_3;
import java.util.*;

public class Fraction_Multiplication_Execution_Class {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating the multiplication of your entered two fractions...");
		System.out.println("So, enter the number for numerator for fraction1 :- ");
		int nume1 = ip.nextInt();
		System.out.println("And, now enter the number for denomenator for fraction1 :- ");
		int deno1 = ip.nextInt();
		Fraction_Multiplication_Business_Class fracMul1 = new Fraction_Multiplication_Business_Class(nume1, deno1);
		System.out.println();
		
		System.out.println("And, now enter the number for numerator for fraction2 :- ");
		int nume2 = ip.nextInt();
		System.out.println("Lastly, now enter the number for denomenator for fraction2 :- ");
		int deno2 = ip.nextInt();
		Fraction_Multiplication_Business_Class fracMul2 = new Fraction_Multiplication_Business_Class(nume2, deno2);
		System.out.println();
		
		System.out.println("So, after multiplication the resultant fraction is as follows :- ");
		Fraction_Multiplication_Business_Class.fracMul(fracMul1, fracMul2);

	}

}
