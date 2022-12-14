package Fraction_Addition_Class_1;

public class Fraction_Business_Increment_Class {

	private int nume, deno;
	
	public Fraction_Business_Increment_Class(int nume, int deno){
		
		this.nume = nume;
		this.deno = deno;
		if(deno == 0)
			this .deno = 1;
		System.out.println("So, your fraction before simplification is like :- ");
		print();
		System.out.println("And, after simplification it is like :- ");
		simplify();
		print();
		
	}
	
	private void simplify(){
		int gcd = 1;
		int smallest_num = Math.min(nume, deno);
		for(int i = 1; i <= smallest_num; i++){
			if(nume % i == 0 && deno % i == 0){
				gcd = i;
			}
		}
		
		nume /= gcd;
		deno /= gcd;
	}
	
	public int getNumeValue(){
		return nume;
	}
	public int getDenoValue(){
		return deno;
	}
	
	public void incRement(){
		int nume1 = nume + deno;
		System.out.println(nume1 + "/" + deno);
	}
	
	public void print(){
		System.out.println(nume + "/" + deno);
	}

}
