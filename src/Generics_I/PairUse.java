package Generics_I;

public class PairUse {

	public static void main(String[] args) {
		
		Pair<String, Integer> pInner = new Pair<>("adsf", 4334);
		Pair<Pair<String, Integer>, String> p = new Pair<>();
		p.setPair1(pInner);
		System.out.println(p.getPair1().getPair1());
		System.out.println(p.getPair1().getPair2());
		
//		Pair<String> pst = new Pair<>();
//		pst.getPair();
//		
//		Pair<Integer> pi = new Pair<Integer>(10, 20);
//		pi.getPair();
//		pi.setPair(30, 60);
//		pi.getPair();
//		
//		Pair<String> ps = new Pair<String>("aa", "bb");
//		ps.getPair();
//		ps.setPair("cc", "dd");
//		ps.getPair();
//		
//		Pair<Double> pd = new Pair<Double>(2.11, 4.22);
//		pd.getPair();
//		pd.setPair(4.33, 5.4444);
//		pd.getPair();
		
//		Pair<Vehicle> pv = new Pair<Vehicle>(34);
		
//		Pair<Integer, String> pis = new Pair<>(2322, "SGgelhi");
//		pis.getPair();
//		pis.setPair(2223, "GSsubuu");
//		pis.getPair();
		
	}

}
