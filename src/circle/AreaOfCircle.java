package circle;
import java.util.Scanner;

public class AreaOfCircle {

	static double area(double r) {
		return (22 * r * r) / 7;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the radius:");
		double radius = sc.nextDouble();

		double Area = area(radius);

		System.out.println("Area of Circle is: " + Area);

	}
}
