package triangle;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st side:");
		double a = sc.nextDouble();

		System.out.println("Enter 2nd side:");
		double b = sc.nextDouble();

		System.out.println("Enter 3rd side:");
		double c = sc.nextDouble();

		if ((a + b) > c && (b + c) > a && (a + c) > b) {
			double s = (a + b + c) / 2;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("Area of Triangle is: " + area);
		} else
			System.out.println("Area of Triangle not exist");

	}// main()
}
