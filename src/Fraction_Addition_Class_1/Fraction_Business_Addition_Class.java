package Fraction_Addition_Class_1;

public class Fraction_Business_Addition_Class {
	
	private int nume, deno;
	
	public void fracAddition(int nume_1, int deno_1, int nume_2, int deno_2){
		int smaller = Math.min(deno_1, deno_2);
		int larger = Math.max(deno_1, deno_2);
		if(larger % smaller == 0){
			deno = larger;
		}
		else {
			deno = larger * smaller;
		}
		
		nume = ((deno/deno_1)*nume_1) + ((deno/deno_2) * nume_2);
	}
	
	public int getNumeValue(){
		return nume;
	}
	
	public int getDenoValue(){
		return deno;
	}
	
}
