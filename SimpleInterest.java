import java.util.*;
class SimpleInterest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Principal");
		Double p=sc.nextDouble();
		System.out.println("Enter Rate");
		Double r=sc.nextDouble();
		System.out.println("Enter Year");
		Double t=sc.nextDouble();
		System.out.println("Simple Interest is : "+(p*r*t)/100);
	}
}