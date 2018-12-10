package Items;

import java.util.Random;

public class Jacket {

	public void jacket() {

		Random rand = new Random();
		int jacketNumber = rand.nextInt(6) + 1;

		switch (jacketNumber) {

		case 1:
			System.out.println("For a jacket, you will wear your Adidas Blue");
			break;
		case 2:
			System.out.println("For a jacket, you will wear your Adidas Black");
			break;
		case 3:
			System.out.println("For a jacket, you will wear your White polo");
			break;
		case 4:
			System.out.println("For a jacket, you will wear your Arc' Terx");
			break;
		case 5:
			System.out.println("For a jacket, you will wear your Black Parka");
			break;
		case 6:
			System.out.println("For a jacket, you will wear your Green zip");
			break;

		}

	}

}
