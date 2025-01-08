import java.util.*;
class CelsiusToFahrenheitConversion{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tempearture in Celsius");
		double a=sc.nextDouble();
		System.out.println("Tempearture in Fahrenheit is: "+((a*(9/5))+32));
	}
}