import java.util.*;
class AverageOfThreeNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		Double a=sc.nextDouble();
		System.out.println("Enter Second Number");
		Double b=sc.nextDouble();
		System.out.println("Enter Third Number");
		Double c=sc.nextDouble();
		System.out.println("Area of given cirlce is : "+(a+b+c)/3);
	}
}