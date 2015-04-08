
public class Psychology {

	private static String title;
	private static int number;
	private static String description;
	
	public Psychology(String Title, int Number, String Description)
	{
		title = Title;
		number = Number;
		description = Description;
	}
	
	public String toString()
	{
		return "Title: " + title + "\n" + "Number: " + number + "\n"
				+ "Description: " + description + "\n";
	}
}
