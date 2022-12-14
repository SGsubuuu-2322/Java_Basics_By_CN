package Dynamic_Array;

public class Dynamic_Array_Business_Class {

	
	private int size = 1;
	private int count = 0;
	private int [] arr;
	
	public Dynamic_Array_Business_Class(){
		arr = new int[size];
	}
	
	public void isCheckandGrow(){
		if(this.size == this.count){
			int [] tempArr = new int[size*2];
			for(int i = 0; i < size; i++){
				tempArr[i] = arr[i];
			}
			size *= 2;
			arr = tempArr;
		}
	}
	
	public void add(int value){
		isCheckandGrow();
		arr[count] = value;
		count++;
	}
	
	public void disPlay(){
		System.out.print("(");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i]);
			if(i < size-1)
				System.out.print(", ");
		}
		System.out.print(")");
	}
	
}
