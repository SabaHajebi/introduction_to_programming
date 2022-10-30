import java.util.Scanner;

public class Inventory {

	private static Item[] items;
	private static Order[] orders;

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		Scanner input = new Scanner(System.in);

		boolean finished = false;
		while(!finished) {
			System.out.println("how many items would you like to create? ");
			int numOfItems = input.nextInt();
			
			System.out.println("What is the item price? ");
			int price = input.nextInt();
			
			System.out.println("What is the item quantity? ");
			int quantity = input.nextInt();
			
			System.out.println("What is the item name? ");
			String name = input.next();
			
			inventory.addItem(name, price, quantity);

			finished = true;
		}


	}

	public void addItem(String itemName, double itemPrice,
			int itemQuantity) {

		items = new Item[items.length];
		for (int i = 0; i < items.length; i++) {
			if (items[i].getId() != items[i+1].getId() && items[i].getPrice() != items[i+1].getPrice()  && items[i].getName() != items[i+1].getName() )
				items[i] = items[i+1];

		}

	}

	public static void createOrder(Item item) {
		orders = new Order[orders.length];
		for (int i = 0; i < orders.length; i++) {
			if (orders[i].getOrderID() != orders[i+1].getOrderID())
				orders[i] = orders[i+1];
		}

	}



}
