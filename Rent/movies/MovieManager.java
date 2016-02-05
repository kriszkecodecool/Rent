package movies;

import java.util.ArrayList;

import movies.Movie.Genre;
import movies.Person.Gender;

public class MovieManager {
	public static final String file = "movies.xml";

	public static void main(String[] args) {
		ArrayList<Person> titanic = new ArrayList<Person>();
		ArrayList<Movie> movies = new ArrayList<Movie>();
		Person person = new Person();
		Person person2 = new Person();
		Movie movie = new Movie();
		Movie movie2 = new Movie();
		
		person.setFirstName("Leonardo");
		person.setLastName("Dicaprio");
		person.setGender(Gender.MALE);
		
		person2.setFirstName("Kate");
		person2.setLastName("Winslet");
		person2.setGender(Gender.FEMALE);
		
		titanic.add(person);
		titanic.add(person2);
		
		for (Person persons : titanic) {
			System.out.println(persons.toXmlString());
		}
		
		movie.setTitle("Titanic");
		movie.setGenre(Genre.ROMANTIC);
		movie.setDuration(200);
		movie.setRate(4.8);
		movie.setCast(titanic);
		
		movie2.setTitle("The Matrix");
		movie2.setGenre(Genre.SCI_FI);
		movie2.setDuration(140);
		movie2.setRate(5.0);
		movie2.setCast(titanic);
		
		
		movies.add(movie);
		movies.add(movie2);
		
		System.out.println(Tools.getMovieTitles(movies)[0]);
		System.out.println(Tools.getMovieTitles(movies)[1]);
		System.out.println(movie.toXmlString());

	}

}
