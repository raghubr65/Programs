package commonPrograms;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		int counter;

		Random rnum = new Random();

		System.out.println("Randon Numbers:");
		System.out.println("***************");

		for (counter = 1; counter <= 5; counter++) {
			System.out.println(rnum.nextInt(200));
		}

	}// main()
}
