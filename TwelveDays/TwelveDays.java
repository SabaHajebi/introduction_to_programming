/*
 * Write a program to produce the lyrics (all 12 verses) of the
 * Twelve Days of Christmas. You must use at least one loop and
 * at least one switch statement in your solution.
 * This is a cumulative song as each verse is build on top of
 * the previous verses.
 * 
 * On the first day of Christmas
 * my true love sent to me:
 * a Partridge in a Pear Tree
 * 
 * On the second day of Christmas
 * my true love sent to me:
 * 2 Turtle Doves
 * and a Partridge in a Pear Tree
 * 
 * On the third day of Christmas
 * my true love sent to me:
 * 3 French Hens,
 * 2 Turtle Doves
 * and a Partridge in a Pear Tree 
 * 
 * ...
 */
public class TwelveDays {

	public static void main(String[] args) {

		final int NUMBER_OF_DAYS = 12;
		for (int dayNumber=1; (dayNumber<=NUMBER_OF_DAYS); dayNumber++)
		{
			String dayNumberName = (dayNumber==12) ? "twelfth" :
				       (dayNumber==11) ? "eleventh" : (dayNumber==10) ? "tenth" : 
				       (dayNumber==9) ? "ninth" : (dayNumber==8) ? "eighth" :
				       (dayNumber==7) ? "seventh" : (dayNumber==6) ? "sixth" :
                       (dayNumber==5) ? "fifth" : (dayNumber==4) ? "fourth" :
                       (dayNumber==3) ? "third" : (dayNumber==2) ? "second" : "first";
			System.out.println("On the " + dayNumberName + " day of Christmas,\nMy true love sent to me:");
			switch (dayNumber)
			{
			case 12:
				System.out.println( "12 Drummers Drumming," );
			case 11:
				System.out.println( "11 Pipers Piping," );
			case 10:
				System.out.println( "10 Lords a Leaping," );
			case 9:
				System.out.println( "9 Ladies Dancing," );
			case 8:
				System.out.println( "8 Maids a Milking," );
			case 7:
				System.out.println( "7 Swans a Swimming," );
			case 6:
				System.out.println( "6 Geese a Laying," );
			case 5:
				System.out.println( "5 Golden Rings," );
			case 4:
				System.out.println( "4 Calling Birds," );
			case 3:
				System.out.println( "3 French Hens," );
			case 2:
				System.out.println( "2 Turtle Doves," );
			case 1:
				if (dayNumber!=1)
					System.out.print("and ");
				System.out.println( "a Partridge in a Pear Tree.\n" );
			default:
			}
		}
	}
}
