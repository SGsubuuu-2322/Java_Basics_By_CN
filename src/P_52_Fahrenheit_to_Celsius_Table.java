//Fahrenheit to Celsius Table
//Send Feedback
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values 
//from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//Input Format :
//3 integers - S, E and W respectively
//Output Format :
//Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value 
//and its corresponding Celsius value should be separate by tab ("\t")
//Constraints :
//0 <= S <= 1000
//0 <= E <= 1000
//0 <= W <= 1000
//Sample Input 1:
//0 
//100 
//20
//Sample Output 1:
//0   -17
//20  -6
//40  4
//60  15
//80  26
//100 37
//Sample Input 2:
//120 
//200 
//40
//Sample Output 2:
//120 48
//160 71
//200 93
//Explanation for Sample Output 2 :
//Start value is 120, end value is 200 and step size is 40. Therefore, the values we need to convert are 120, 120 + 40 = 160, and 160 + 40 = 200. 
//The formula for converting Fahrenheit to Celsius is:
//Celsius Value = (5/9)*(Fahrenheit Value - 32)  
//Plugging 120 into the formula, the celsius value will be (5 / 9)*(120 - 32) => (5 / 9) * 88 => (5 * 88) / 9 => 440 / 9 => 48.88
//But we'll only print 48 because we are only interested in the integral part of the value.




import java.util.*;
public class P_52_Fahrenheit_to_Celsius_Table {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing a fahrahneit to celsius table of the numbers entered by user...");
		System.out.println("So enter starting number :- ");
		int num1 = ip.nextInt();
		System.out.println("So, enter the last number till which you want the conversion :- ");
		int num2 = ip.nextInt();
		System.out.println("Now, enter the gap you want in the table :- ");
		int gap = ip.nextInt();
		for(int i = num1; i <= num2; i += gap){
			 System.out.println(i + "\t" + (5*(i-32))/9);
		}
		

	}

}
