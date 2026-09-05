package aggregation;

public class Course {
	private String courseName;
	private Instructor instructor;
	private Textbook textbook;

	// Constructor
	public Course(String courseName, Instructor instructor, Textbook textbook) {
		setCourseName(courseName);
		setInstructor(instructor);
		setTextbook(textbook);
	}

	// Accessors
	public String getCourseName() {
		return courseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	// Mutators
	public void setCourseName(String courseName) {
		if (courseName == null || courseName.isEmpty()) {
			System.err.println("Course name cannot be blank");
			return;
		}
		this.courseName = courseName;
	}

	public void setInstructor(Instructor instructor) {
		if (instructor == null) {
			System.err.println("Instructor cannot be null");
			return;
		}
		this.instructor = instructor;
	}

	public void setTextbook(Textbook textbook) {
		if (textbook == null) {
			System.err.println("Textbook cannot be null");
			return;
		}
		this.textbook = textbook;
	}

	// Other functions
	public void print() {
		System.out.println("Course name: " + courseName);
		System.out.println("Instructor: " + instructor.getFirstName() + " "
				+ instructor.getLastName());
		System.out.println("Textbook: " + textbook.getTitle() + " by "
				+ textbook.getAuthor());
	}

}
