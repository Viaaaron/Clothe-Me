package Items;

import java.util.Random;

public class Jacket {

	public void jacket() {

		Random rand = new Random();
		int jacketNumber = rand.nextInt(6) + 1;

		switch (jacketNumber) {

		case 1:
			System.out.println("Jacket: Adidas Blue");
			break;
		case 2:
			System.out.println("Jacket: Adidas Black");
			break;
		case 3:
			System.out.println("Jacket: White polo");
			break;
		case 4:
			System.out.println("Jacket: Arc' Terx");
			break;
		case 5:
			System.out.println("Jacket: Black Parka");
			break;
		case 6:
			System.out.println("Jacket: Green zip");
			break;

		}

	}

}
