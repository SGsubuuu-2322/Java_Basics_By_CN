package Fraction_Substraction_Class_2;

public class Fraction_Substraction_Business_Class {
	
	private int nume, deno;

	public  Fraction_Substraction_Business_Class(int nume, int deno){
		
		if(deno == 0)
			this.deno = 1;
		this.nume = nume;
		this.deno = deno;
		System.out.println("So, your fraction before simplification :- ");
		print();
		System.out.println("And, your fraction after simplification :- ");
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
	
	
	public void subsTract(Fraction_Substraction_Business_Class fracSub2){
		int deno = 0;
		int smaller = Math.min(this.deno, fracSub2.deno);
		int larger = Math.max(this.deno, fracSub2.deno);
		if(larger % smaller == 0){
			deno = larger;
		}
		else {
			deno = larger * smaller;
		}
		
		nume = ((deno/this.deno)*this.nume) - ((deno/fracSub2.deno) * fracSub2.nume);
		this.deno = deno;
		simplify();
	}
	
	
}
