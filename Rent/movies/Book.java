package movies;

public class Book extends Product {
	Person author;

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	@Override
	long getInvestment() {
		return author.getSalary();
	}
}
