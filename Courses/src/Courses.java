
public class Courses {

	public static void main(String[] args) {
		
		Psychology psychology = new Psychology("Psychology", 201, "Learn about the human mind");
		History history = new History("US History", 121, "Learn about US history");
		ComputerScience computerscience = new ComputerScience("Computer Science", 201, "Introduction to programming");
		
		System.out.println(computerscience);
		System.out.println(history);
		System.out.println(psychology);

	}

}
