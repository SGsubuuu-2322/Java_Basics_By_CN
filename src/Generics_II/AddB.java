package Generics_II;

public class AddB {

	public static void main(String[] args) {
//		Add<Integer> ai = new Add<>(22, 23);
//		ai.add();
//		
//		Add<Double> ad = new Add<>(22.0000, 23.000);
//		ad.add();
		
		Add<Integer, Double> aid = new Add<>(23, 22.090);
		aid.add();
		aid.setNum1(2322);
		aid.setNum2(2223.0000);
		aid.add();

	}

}
