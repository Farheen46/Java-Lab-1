import java.util.Scanner;

public class AreaOfCircle {
    
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the radius:");
		double radius = sc.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("the area of circle is; "+ area);
		double circumference= Math.PI * 2*radius;
		System.out.println("the circumference of the circle is;"+circumference);
		

	}

}
