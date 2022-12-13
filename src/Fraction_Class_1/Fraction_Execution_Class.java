package Fraction_Class_1;
import java.util.*;

public class Fraction_Execution_Class {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for calculating simpliest version for your fraction and incrementing it...");
		int nume = 0, deno = 0;
		System.out.println("So, enter the number for numerator for your fraction :- ");
		nume = ip.nextInt();
		System.out.println("And, now enter the number for denomenator for your fraction :- ");
		deno = ip.nextInt();
		Fraction_Business_Class frac = new Fraction_Business_Class(nume, deno);
		
		
		System.out.println("And, after increment it is like :- ");
		frac.incRement();
		frac.print();

	}

}
