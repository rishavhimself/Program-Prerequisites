import java.util.*;
class PerimeterOfARectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		Double l=sc.nextDouble();
		System.out.println("Enter Width");
		Double w=sc.nextDouble();
		System.out.println("Perimeter of given rectangle is : "+(2*(l+w)));
	}
}