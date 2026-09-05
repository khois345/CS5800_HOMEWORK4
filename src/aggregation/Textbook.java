package aggregation;

public class Textbook {
	private String title;
	private String author;
	private String publisher;

	// Constructor
	public Textbook(String title, String author, String publisher) {
		setTitle(title);
		setAuthor(author);
		setPublisher(publisher);
	}

	// Accessors
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	// Mutators
	public void setTitle(String title) {
		if (title == null || title.isEmpty()) {
			System.err.println("Title cannot be blank");
			return;
		}
		this.title = title;
	}

	public void setAuthor(String author) {
		if (author == null || author.isEmpty()) {
			System.err.println("Author cannot be blank");
			return;
		}
		this.author = author;
	}

	public void setPublisher(String publisher) {
		if (publisher == null || publisher.isEmpty()) {
			System.err.println("Publisher cannot be blank");
			return;
		}
		this.publisher = publisher;
	}
}
