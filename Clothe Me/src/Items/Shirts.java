package Items;

import java.util.Random;

public class Shirts {

	public void shirts() {

		Random rand = new Random();
		int shirtNumber = rand.nextInt(6) + 1;

		switch (shirtNumber) {

		case 1:
			System.out.println("Shirt: Blue T");
			break;
		case 2:
			System.out.println("Shirt: Black T");
			break;
		case 3:
			System.out.println("Shirt:Grey T");
			break;
		case 4:
			System.out.println("Shirt:Black V");
			break;
		case 5:
			System.out.println("Shirt:Alcotraz T");
			break;
		case 6:
			System.out.println("Shirt: Tan T");
			break;

		}
	}
}
