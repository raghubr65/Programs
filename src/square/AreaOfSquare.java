package square;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Side of Square:");
		double side = sc.nextDouble();

		// Area of Square=side*side
		double area = side * side;

		System.out.println("Area of Square is:" + area);
	}// main()
}//test change
