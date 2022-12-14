package Complex_Number_Problem;

public class CompNum_Business_Class {

	
	private int real, imagin;
	
	public  CompNum_Business_Class(int real, int imagin){
		this.real = real;
		this.imagin = imagin;
	}
	
	public void plus(CompNum_Business_Class c2){
		real = this.real + c2.real;
		imagin = this.imagin + c2.imagin;
	}
	
	public void multiply(CompNum_Business_Class c2){
		  real = this.real * c2.real - this.imagin * c2.imagin;
	      imagin = this.real * c2.imagin + c2.real + this.imagin;
	    
	}
	
	public void print(){
		System.out.println(real + " + " + imagin + "i");
	}
	
	
}
