
public class Poem {

	public static void main(String[] args) {
		String poem = "I often wondered when I cursed,\r\n"
				+ "Often feared where I would be \r\n"
				+ "Wondered where she’d yield her love\r\n"
				+ "When I yield so will she.\r\n"
				+ "I would her will be pitied!\r\n"
				+ "Cursed be love! She pitied me";
		
		String[] poemArray = poem.split(",");
		
		 for (String s : poemArray) 
	            System.out.println(s); 
		
		
		
	}

}
