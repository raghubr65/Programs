package interest;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		float p, t, r;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal amount:");
		p = sc.nextFloat();

		System.out.println("Enter rate of interest:");
		r = sc.nextFloat();

		System.out.println("Enter time:");
		t = sc.nextFloat();

		float si;
		si = (r * t * p) / 100;

		System.out.println("The Simple Interest is: " + si);

	}
}
