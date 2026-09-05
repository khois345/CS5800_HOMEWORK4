package aggregation;

public class initAggregation {

	public static void main(String[] args) {
		Instructor[] instructors = {
			new Instructor("Nima", "Davarpanah", "3-2636"),
			new Instructor("Professor Nima", "Davarpanah", "Building 3-2636"),		
		};
		
		Textbook[] textbooks = {
				new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"),
				new Textbook("Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "Addison-Wesley")
		};

		Course course = new Course(
				"CS 5800 -- Software Engineering", instructors, textbooks);

		course.print();

	}
}
