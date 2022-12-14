package Complex_Number_Problem;
import java.util.*;

public class CompNum_Execution_Class {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for doing some functions on complpex numbers...");
		System.out.println("So, enter the value for real number1 :- ");
		int real1 = ip.nextInt();
		System.out.println("And, now enter the value for imaginary number1 :- ");
		int imagin1 = ip.nextInt();
		CompNum_Business_Class c1 = new CompNum_Business_Class(real1, imagin1);
		
		System.out.println("So, enter the value for real number2 :- ");
		int real2 = ip.nextInt();
		System.out.println("And, now enter the value for imaginary number2 :- ");
		int imagin2 = ip.nextInt();
		CompNum_Business_Class c2 = new CompNum_Business_Class(real2, imagin2);
		
		System.out.println("Now, enter 1 for complex numbers addition and enter 2 for complex numbers multiplication :- ");
		int choice = ip.nextInt();
		
		if(choice == 1){
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2){
			c1.multiply(c2);
			c1.print();
		}
		else
			System.out.println("Enter a valid choice...");
	}

}
