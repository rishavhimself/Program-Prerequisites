import java.util.*;
class VolumeOfACylinder{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Radius");
		Double r=sc.nextDouble();
		System.out.println("Enter The Height");
		Double h=sc.nextDouble();
		System.out.println("Volume of given cylinder is : "+(Math.PI*r*r*h));
	}
}