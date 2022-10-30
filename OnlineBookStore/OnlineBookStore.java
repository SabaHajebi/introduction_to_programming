import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class OnlineBookStore {
	public static int ISBN_INDEX = 0;
	public static int TITLE_INDEX = 1;
	public static int AUTHOR_INDEX = 2;
	public static int PUBLISHER_INDEX = 3;
	public static int PUBLISHER_YEAR_INDEX = 4;
	public static int QUANTITY_INDEX = 5;
	public static int PRICE_INDEX = 6;
	
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			FileReader fileReader = new FileReader("C:\\Users\\lhackett\\IdeaProjects\\etest3\\src\\books.txt");// Enter the entire path of the file if needed
			BufferedReader bufferedReader = new BufferedReader(fileReader);  
			boolean endOfFile = false;
	        while(!endOfFile){
	        	String bookLine = bufferedReader.readLine();
	        	if (bookLine != null) {
	        		String[] bookData = bookLine.split(", ");
	        		String isbn = bookData[ISBN_INDEX];
	        		String title = bookData[TITLE_INDEX];
	        		String author = bookData[AUTHOR_INDEX];
	        		String publisher = bookData[PUBLISHER_INDEX];
	        		int publishYear = Integer.parseInt (bookData[PUBLISHER_YEAR_INDEX]);
	        		int quantity = Integer.parseInt (bookData[QUANTITY_INDEX]);
	        		double price = Double.parseDouble (bookData[PRICE_INDEX]);
	        		Book book = new Book(isbn, title, author, publisher, publishYear, quantity, price);
	        		bookList.add(book);

	        	} else {
	        		endOfFile = true;
	        	}
	        }
	        
	        bufferedReader.close();    
	        fileReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		printBookDetails(bookList);
		purchaseBook(bookList);
	}

	public static void printBookDetails(ArrayList<Book> bookList){
		for(Book book : bookList){
			System.out.println(book.toString());
		}
	}

	public static Book getBook(ArrayList<Book> bookList, String title){
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
		return null;
	}

	public static void topUpCard(ChargeCard card, double amount) {
		card.topUpFunds(amount);
	}

	public static void purchaseBook(ArrayList<Book> bookList){
	    NumberFormat euroFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);

		ChargeCard card = new ChargeCard();
		Scanner in = new Scanner(System.in);
		boolean validMoney = false;
		while(!validMoney) {
			System.out.print("How much money do you have on your card? ");
			if (in.hasNextDouble()) {
				topUpCard(card, in.nextDouble());
				validMoney = true;
				in.nextLine(); //Clear system.in scanner fully
			} else {
				System.out.println("That was not a valid amount, please try again");
				in.nextLine();
			}
		}

		boolean done = false;
		while(!done){
			System.out.print("What book do you want to buy? ");
			String title = in.nextLine();
			Book requestedBook = getBook(bookList, title);
			if(requestedBook != null) {
				if(requestedBook.getQuantity() > 0){
					if(card.getFunds() >= requestedBook.getPrice()){
						requestedBook.setQuantity(requestedBook.getQuantity()-1);
						card.setFunds(card.getFunds()-requestedBook.getPrice());
						System.out.println("You successfully bought " + requestedBook.getTitle());
						System.out.println("You have " + euroFormat.format(card.getFunds()) + " left");
					}
					else{
						System.out.println("You don't have enough money for that book.");
					}
				}
				else{
					System.out.println("That book is not in stock.");
				}
			}
			else{
				System.out.println("We don't have that book in our store");
			}

			System.out.print("Would you like to make another purchase?(or q to quit): ");
			if(in.hasNext("q") || in.hasNext("Q")){
				done = true;
				in.close();
			}
            else {
                in.nextLine(); //Clear system.in scanner before looping
            }
        }

		System.out.println("Thanks for visiting");
	}
}