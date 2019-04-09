package emi;

import java.util.Scanner;

public class EMI {
	public static void main(String[] args) {
		double principalAmount, rateOfInterest, time, emi;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal amount:");
		principalAmount = sc.nextDouble();

		System.out.println("Enter rate of interest:");
		rateOfInterest = sc.nextDouble();

		System.out.println("Enter time in Year:");
		time = sc.nextDouble();

		rateOfInterest = rateOfInterest / (12 * 100);
		time = time * 12;

		emi = (principalAmount * rateOfInterest * Math.pow(1 + rateOfInterest,
				time)) / (Math.pow(1 + rateOfInterest, time) - 1);

		System.out.println("Monthly EMI= " + emi);
		System.out.println("Total EMI per Annum = " + emi * 12);

	}// main()
}// class
