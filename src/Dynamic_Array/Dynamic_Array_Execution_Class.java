package Dynamic_Array;

public class Dynamic_Array_Execution_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamic_Array_Business_Class dArray = new Dynamic_Array_Business_Class();
		dArray.add(5);
		dArray.add(6);
		dArray.add(2);
		dArray.add(1);
		dArray.disPlay();
		
		System.out.println(dArray.getElement(2));
		System.out.println(dArray.getElement(5));
		dArray.setElement(3, 5);
		dArray.disPlay();
		

	}

}
