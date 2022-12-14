package Generics_I;

public class Pair<T, S> {

	private T pair1;
	private S pair2;
	public Pair() {}
	public Pair(T pair1, S pair2){
		this.pair1 = pair1;
		this.pair2 = pair2;
	}
	
	public void setPair1(T pair1) {
		this.pair1 = pair1;
	}
	public void setPair2(S pair2) {
		this.pair2 = pair2;
	}
	
	public T getPair1(){
		return pair1;
	}
	public S getPair2(){
		return pair2;
	}

}
