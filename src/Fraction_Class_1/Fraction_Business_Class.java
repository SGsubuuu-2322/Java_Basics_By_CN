package Fraction_Class_1;

public class Fraction_Business_Class {

	private int nume, deno;
	
	public Fraction_Business_Class(int nume, int deno){
		
		this.nume = nume;
		this.deno = deno;
		System.out.println("So, your fraction before simplification is like :- ");
		print();
		System.out.println("And, after simplification it is like :- ");
		simplify();
		print();
		
	}
	
	private void simplify(){
		int gcd = 1;
		int smallest_num = Math.min(nume, deno);
		for(int i = 2; i < smallest_num; i++){
			if(nume % i == 0 && deno % i == 0){
				gcd = i;
			}
		}
		
		nume /= gcd;
		deno /= gcd;
	}
	
	public void incRement(){
		nume = nume + deno;
	}
	
	public void print(){
		System.out.println(nume + "/" + deno);
	}

}
