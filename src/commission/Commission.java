package commission;

import java.util.Scanner;

public class Commission {
	public static void main(String[] args) {
		double principalAmount, percentage, commission;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter amount:");
		principalAmount = sc.nextDouble();

		System.out.println("Enter commissionRate:");
		percentage = sc.nextDouble();

		commission = (percentage / 100) * 100;
		
		System.out.println("Commission amount: " +commission);

	}// main()
}// class
