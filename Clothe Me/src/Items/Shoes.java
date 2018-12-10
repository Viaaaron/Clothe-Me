package Items;

import java.util.Random;

public class Shoes {

	public void shoes() {

		Random rand = new Random();
		int shoeNumber = rand.nextInt(7) + 1;

		switch (shoeNumber) {

		case 1:
			System.out.println("Shoes: adidas Green");
			break;
		case 2:
			System.out.println("Shoes: adidas Foams");
			break;
		case 3:
			System.out.println("Shoes: adidas Watershoe");
			break;
		case 4:
			System.out.println("Shoes: Desert Boots");
			break;
		case 5:
			System.out.println("Shoes: Steve Maddens");
			break;
		case 6:
			System.out.println("Shoes: Kenndy's");
			break;
		case 7:
			System.out.println("Shoes: Flops");
			break;
		}

	}

}
