package Items;

import java.util.Random;

public class Pants {

	public void pants() {

		Random rand = new Random();
		int pantNumber = rand.nextInt(5) + 1;

		switch (pantNumber) {

		case 1:
			System.out.println("Pants: Blue Jeans");
			break;
		case 2:
			System.out.println("Pants: Dark Blues");
			break;
		case 3:
			System.out.println("Pants:Black Jeans");
			break;
		case 4:
			System.out.println("Pants: Grey Vee's");
			break;
		case 5:
			System.out.println("Pants: Holy Jeans");
			break;

		}

//		System.out.println(pantNumber);

	}

}
