package Items;

import java.util.Random;

public class Shoes {

	public void shoes() {

		Random rand = new Random();
		int shoeNumber = rand.nextInt(7) + 1;

		switch (shoeNumber) {

		case 1:
			System.out.println("... and for shoes, you will wear adidas Green");
			break;
		case 2:
			System.out.println("... and for shoes, you will wear adidas Foams");
			break;
		case 3:
			System.out.println("... and for shoes, you will wear adidas Watershoe");
			break;
		case 4:
			System.out.println("... and for shoes, you will Desert Boots");
			break;
		case 5:
			System.out.println("... and for shoes, you will wear Steve Maddens");
			break;
		case 6:
			System.out.println("... and for shoes, you will wear Kenndy's");
			break;
		case 7:
			System.out.println("... and for shoes, you will wear flops");
			break;
		}

	}

}
