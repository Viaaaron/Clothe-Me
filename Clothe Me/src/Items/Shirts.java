package Items;

import java.util.Random;

public class Shirts {

	public void shirts() {

		Random rand = new Random();
		int shirtNumber = rand.nextInt(6) + 1;

		switch (shirtNumber) {

		case 1:
			System.out.println("For shirt, you will wear Blue T");
			break;
		case 2:
			System.out.println("For shirt, you will wear Black T");
			break;
		case 3:
			System.out.println("For shirt, you will wear Grey T");
			break;
		case 4:
			System.out.println("For shirt, you will wear Black V");
			break;
		case 5:
			System.out.println("For shirt, you will wear Alcotraz T");
			break;
		case 6:
			System.out.println("For shirt, you will wear Tan T");
			break;

		}
	}
}
