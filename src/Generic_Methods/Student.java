package Generic_Methods;

public class Student implements PrintInterface{

	private int rollNo;

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}
	
	public void print(){
		System.out.println(rollNo);
	}

}
