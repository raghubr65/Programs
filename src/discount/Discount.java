package discount;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		double discount, price, discounted, amount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter price:");
		price = sc.nextDouble();

		System.out.println("Enter discount of the product:");
		discount = sc.nextDouble();

		discounted = 100 - discount;

		amount = (discounted * price) / 100;

		System.out.println("Amount after discount: " + amount);
		System.out.println("Your discount is: " + (price - amount));
	}
}
