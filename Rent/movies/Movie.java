package movies;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Product implements Buyable {
	String title;
	enum Genre {
		ROMANTIC,
		DRAMA,
		SCI_FI,
		THRILLER,
		HORROR,
		ACTION,
		COMEDY
	}
	Genre genre;
	long duration;
	double rate;
	public static final String file = "movies.xml";
	int price;
	private List<Person> cast = new ArrayList<Person>();
	int id;
	
	public String getTitle() {
		return title;
	}

	public int getPrice() {
		for (Person person : cast) {
			price += person.getSalary();
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public List<Person> getCast() {
		return cast;
	}

	public void setCast(List<Person> cast) {
		this.cast = cast;
	}
	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String test(Person person) {
		return person.toXmlString();
	}

	public String toXmlString(){
	    StringBuilder sb = new StringBuilder();
	    sb.append("<movie>");
	    sb.append(Tools.toXMLTag("title", getTitle()));
	    sb.append(Tools.toXMLTag("genre", getGenre().toString()));
	    sb.append(Tools.toXMLTag("duration", String.valueOf(getDuration())));
	    sb.append(Tools.toXMLTag("rate", String.valueOf(getRate())));
	    sb.append(Tools.toXMLTag("cast", String.valueOf(getCast())));
	    sb.append("</movie>");
	    return sb.toString();
	}

	@Override
	long getInvestment() {
		long total = 0;
		for (Person person : cast) {
			total += person.getSalary();
		}
		return total;
	}

}
