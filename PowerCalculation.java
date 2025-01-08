import java.util.*;
class PowerCalculation{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Base");
		Double b=sc.nextDouble();
		System.out.println("Enter Power");
		Double p=sc.nextDouble();
		System.out.println("The desired result is : "+(Math.pow(b,p)));
	}
}