package Items;

import java.util.Random;

public class Pants {

	public void pants() {

		Random rand = new Random();
		int pantNumber = rand.nextInt(5) + 1;

		switch (pantNumber) {

		case 1:
			System.out.println("For pants, you will wear Blue Jeans");
			break;
		case 2:
			System.out.println("For pants, you will wear Dark Blues");
			break;
		case 3:
			System.out.println("For pants, you will wear Black Jeans");
			break;
		case 4:
			System.out.println("For pants, you will wear Grey Vee's");
			break;
		case 5:
			System.out.println("For pants, you will wear Holy Jeans");
			break;

		}

//		System.out.println(pantNumber);

	}

}
