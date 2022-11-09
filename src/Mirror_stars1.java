import java.util.Scanner;
public class Mirror_stars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		for(int i = 0; i < num; i++){
			for(int j = 0; j < (num-i); j++)
				System.out.print("*");
//			for(int k = 0; k < i; k++)
//				System.out.print(k);
			System.out.println();
		}
		

	}

}
