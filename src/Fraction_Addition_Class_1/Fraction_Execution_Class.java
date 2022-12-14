package Fraction_Addition_Class_1;
import java.util.*;

public class Fraction_Execution_Class {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating simpliest version for your fractions and incrementing  and adding it...");
		int nume1 = 0, deno1 = 0, nume2 = 0, deno2 = 0;
		System.out.println("So, enter the number for numerator for your fraction1 :- ");
		nume1 = ip.nextInt();
		System.out.println("And, now enter the number for denomenator for your fraction1 :- ");
		deno1 = ip.nextInt();
		System.out.println("So, enter the number for numerator for your fraction2 :- ");
		nume2 = ip.nextInt();
		System.out.println("And, now enter the number for denomenator for your fraction2 :- ");
		deno2 = ip.nextInt();
		System.out.println("So, the phases for your fraction1 are like :- ");
		Fraction_Business_Increment_Class frac1 = new Fraction_Business_Increment_Class(nume1, deno1);
		System.out.println("And, after increment your fraction1 is like :- ");
		frac1.incRement();
		System.out.println();
		System.out.println("And, the phases for your fraction2 will be like :- ");
		Fraction_Business_Increment_Class frac2 = new Fraction_Business_Increment_Class(nume2, deno2);
		System.out.println("And, after increment your fraction1 is like :- ");
		frac2.incRement();
		
		
		int nume_1 = frac1.getNumeValue(), deno_1 = frac1.getDenoValue();
		int nume_2 = frac2.getNumeValue(), deno_2 = frac2.getDenoValue();
		
		Fraction_Business_Addition_Class fracAdd = new Fraction_Business_Addition_Class();
		fracAdd.fracAddition(nume_1, deno_1, nume_2, deno_2);
		
		int nume = fracAdd.getNumeValue();
		int deno = fracAdd.getDenoValue();
		
		System.out.println();
		System.out.println("So, the results for fraction addition are as follows :- ");
		Fraction_Business_Increment_Class fracI = new Fraction_Business_Increment_Class(nume, deno);

	}

}
