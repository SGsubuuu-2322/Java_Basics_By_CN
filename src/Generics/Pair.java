package Generics;

public class Pair<T, S> {

	private T pair1;
	private S pair2;
	public Pair() {}
	public Pair(T pair1, S pair2){
		this.pair1 = pair1;
		this.pair2 = pair2;
	}
	
	public void setPair(T pair1, S pair2) {
		this.pair1 = pair1;
		this.pair2 = pair2;
	}
	
	public void getPair(){
		System.out.println("(" + pair1 + "," + pair2 + ")");
	}

}
