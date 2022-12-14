package Fraction_Multiplication_Class_3;

public class Fraction_Multiplication_Business_Class {
	
	private int nume, deno;
	
	public Fraction_Multiplication_Business_Class(int nume, int deno){
		this.nume = nume;
		this.deno = deno;
		System.out.println("So, your fraction before simplification is as follows :- ");
		print();
		System.out.println("And, after simplification your entered fraction is as follows :- ");
		simplify();
		print();
	}
	
	public void print(){
		System.out.println(nume + "/" + deno);
	}
	
	private void simplify(){
		int gcd = 1;
		int smaller = Math.min(nume, deno);
		for(int i = 1; i <= smaller; i++){
			if(nume % i == 0 && deno % i == 0)
				gcd = i;
		}
		
		nume /= gcd;
		deno /= gcd;
	}
	
	public static int num = 0, den = 0;
	public static void fracMul(Fraction_Multiplication_Business_Class mul1, Fraction_Multiplication_Business_Class mul2){
		int smaller = Math.min(mul1.deno, mul2.deno);
		int larger = Math.max(mul1.deno, mul2.deno);
		if(larger % smaller == 0){
			den = larger;
		}
		else {
			den = larger * smaller;
		}
		
		num = ((den/mul1.deno)*mul1.nume) * ((den/mul2.deno) * mul2.nume);
		Fraction_Multiplication_Business_Class frac3 = new Fraction_Multiplication_Business_Class(num, den);
	}
	
}
