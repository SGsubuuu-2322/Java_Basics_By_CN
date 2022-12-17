package Generics_II;

public class Add<I, D> {
	
	private I num1;
	private D num2;
	
	public Add(I num1, D num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public I getNum1(){
		return num1;
	}
	
	public void setNum1(I num1){
		this.num1 = num1;
	}
	
	public D getNum2(){
		return num2;
	}
	public void setNum2(D num2){
		this.num2 = num2;
	}
	
	public void add() {
		System.out.println(num1 + "+" + num2);
	}
	
	
}
