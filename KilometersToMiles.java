import java.util.*;
class KilometersToMiles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Distance in Kms");
		Double a=sc.nextDouble();
		System.out.println("Given distance in Miles is : "+(a*0.621371));
	}
}