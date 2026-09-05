package aggregation;

public class Course {
	private String courseName;
	private Instructor[] instructors;
	private Textbook[] textbooks;

	// Constructor
	public Course(String courseName, Instructor[] instructors, Textbook[] textbooks) {
		setCourseName(courseName);
		setInstructors(instructors);
		setTextbooks(textbooks);
	}

	// Accessors
	public String getCourseName() {
		return courseName;
	}

	public Instructor[] getInstructors() {
		return instructors;
	}

	public Textbook[] getTextbooks() {
		return textbooks;
	}

	// Mutators
	public void setCourseName(String courseName) {
		if (courseName == null || courseName.isEmpty()) {
			System.err.println("Course name cannot be blank");
			return;
		}
		this.courseName = courseName;
	}

	public void setInstructors(Instructor[] instructors) {
		if (instructors == null) {
			System.err.println("Instructors cannot be null");
			return;
		}
		this.instructors = instructors;
	}

	public void setTextbooks(Textbook[] textbooks) {
		if (textbooks == null) {
			System.err.println("Textbooks cannot be null");
			return;
		}
		this.textbooks = textbooks;
	}

	// Other functions
	public void print() {
		System.out.println("Course name: " + courseName);
		for (int i = 0; i < instructors.length; i++) {
			Instructor instructor = instructors[i];
			System.out.println("Instructor " + (i + 1) + ": " + instructor.getFirstName() + " " + instructor.getLastName());
		}
		for (int i = 0; i < textbooks.length; i++) {
			Textbook textbook = textbooks[i];
			System.out.println("Textbook " + (i + 1) + ": " + textbook.getTitle() + " by " + textbook.getAuthor());
		}
	}

}
