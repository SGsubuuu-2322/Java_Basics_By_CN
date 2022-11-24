//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values
//from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//Input Format :
//3 integers - S, E and W respectively 
//Output Format :
//Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form.
//The Fahrenheit value and its corresponding Celsius value should be separate by single space.
//Constraints :
//0 <= S <= 90
//S <= E <=  900
//0 <= W <= 80 
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
//20
//119
//13
//Sample Output 2:
//20  -6
//33  0 
//46  7
//59  15
//72  22
//85  29
//98  36
//111 43
//Explanation For Input 2:
//Start calculating the Celsius values for each Fahrenheit Value which starts from 20. So starting from 20, we need to compute its 
//corresponding Celsius value which computes to -6. We print this information as <Fahrenheit Value> <a single space> <Celsius Value> 
//on each line. Now add 13 to Fahrenheit Value at each step until you reach 119 in this case. You may or may not exactly land on the 
//end value depending on the steps you are taking.


import java.util.*;
public class P_18_Fahrenheit_to_Celsius_Table {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("This is the program for printing user entered fahrenheit to celsius table...");
		System.out.println("Enter the number from where you want to start the conversion :- ");
		int num1 = ip.nextInt();
		System.out.println("Enter the number till which you want the conversion to be printed :- ");
		int num2 = ip.nextInt();
		System.out.println("Enter the gap betweeen the each conversion you want :- ");
		int gap = ip.nextInt();
		for(int i = num1; i <= num2; i += gap){
			int celsius = (i - 32) * 5/9;
			System.out.println(i + " " + celsius);
			
		}
	}

}