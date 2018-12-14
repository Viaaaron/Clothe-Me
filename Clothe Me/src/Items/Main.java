package Items;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * TODAY: DEC 14th 1. Set up scanner 2. Ask user what they would like to
		 * do 3. If 1 --Add Item 4. What item would you like to add 5. 1--Shirt
		 * 2--Pant ......etc 6. Store new item in an array 7. Print new item was
		 * added 8. Else 2 --Tell me what to wear 9. Print randomized clothe
		 * 
		 * Adding arrays or some sort of storage process will most likely mean
		 * having to randomize a row or column that was assigned to an item for
		 * instance, pants would be row one but may only be 4 columns wide as
		 * opposed to shirts that would be row 2 and 7 columns wide. This array
		 * would be uneven
		 * 
		 * Other options could be using "Java Serialization" for converting
		 * objects to bytes and store them
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("\tWhat can I do for you today?");
		System.out.println("\t1: To Clothe\n\t2:Add new item\n");

		int userInput = sc.nextInt();

		if (userInput == 1) {
			Shirts shirt = new Shirts();

			Pants pants = new Pants();
			Jacket jacket = new Jacket();
			Shoes shoe = new Shoes();

			shirt.shirts();
			pants.pants();
			jacket.jacket();
			shoe.shoes();
		}

		else {

			System.out.println("What type of item would you like to add? ");
			System.out.println("\t1: Shirt\n\t2: Pants\n\t3: Shoes\n\t4: Jacket\n\t6: Other");

		}

	}

}
