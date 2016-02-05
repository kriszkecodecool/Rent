package movies;

public abstract class Product {
	String id;
	String title;
	Person person;
	
	public void setId() {
		this.id = IdGenerator.Generate(this);
	}
	public String getTitle() {
		return title;
	}
	public Person getPerson() {
		return person;
	}
	abstract long getInvestment();

}
