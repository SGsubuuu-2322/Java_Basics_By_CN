package Generic_Methods;

public class Generic_Methods {
	
	public static<T extends PrintInterface> void printArray(T [] arr){
		for(int i = 0; i < arr.length; i++)
			arr[i].print();
	}

	public static void main(String[] args) {
		
				
//		Integer [] arr = new Integer[5];
//		for(int i = 0; i < arr.length; i++)
//			arr[i] = i+1;
//		
//		printArray(arr);
//		
//		String [] str = new String[5];
//		for(int i = 0; i < str.length; i++)
//			str[i] = "SGsubu";
//		printArray(str);
//		
//		Double [] dtr = new Double[5];
//		for(int i = 0; i < dtr.length; i++)
//			dtr[i] = 1.01+1;
//		printArray(dtr);
		
		Vehicle [] vh = new Vehicle[5];
		for(int i = 0; i < vh.length; i++)
			vh[i] = new Vehicle(10+i , "SGsubu");
		printArray(vh);
		
		Student [] st = new Student[5];
		for(int i= 0; i < st.length; i++)
			st[i] = new Student(10+i);
		printArray(st);
		

	}

}
