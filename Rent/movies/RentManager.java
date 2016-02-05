package movies;

import java.util.ArrayList;
import java.util.List;

import movies.Movie.Genre;
import movies.Person.Gender;

public class RentManager {
	public static void main(String[] args) {
		ArrayList<Person> titanic = new ArrayList<Person>();
		ArrayList<Person> nemtitanic = new ArrayList<Person>();
		ArrayList<Buyable> buyable = new ArrayList<Buyable>();
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Movie movie = new Movie();
		Movie movie2 = new Movie();
		Book book = new Book();
		Book book2 = new Book();
		Game game = new Game();
		Game game2 = new Game();
		
		person.setFirstName("Leonardo");
		person.setLastName("Dicaprio");
		person.setGender(Gender.MALE);
		person.setSalary(1000);
		
		person2.setFirstName("Kate");
		person2.setLastName("Winslet");
		person2.setGender(Gender.FEMALE);
		person2.setSalary(2000);
		
		person3.setFirstName("Nagy");
		person3.setLastName("Bela");
		person3.setGender(Gender.MALE);
		person3.setSalary(5000);
		
		book.setAuthor(person);
		book2.setAuthor(person2);
		
		game.setPreOrdered(true);
		game.setPrice(2500);
		game.setStaff(titanic);
		
		game2.setPreOrdered(false);
		game2.setPrice(5500);
		game2.setStaff(nemtitanic);
		
		titanic.add(person);
		titanic.add(person2);
		nemtitanic.add(person);
		nemtitanic.add(person3);
		
		movie.setTitle("Titanic");
		movie.setGenre(Genre.ROMANTIC);
		movie.setDuration(200);
		movie.setRate(4.8);
		movie.setCast(titanic);
		
		movie2.setTitle("The Matrix");
		movie2.setGenre(Genre.SCI_FI);
		movie2.setDuration(140);
		movie2.setRate(5.0);
		movie2.setCast(nemtitanic);
		
		buyable.add((Movie)movie);
		buyable.add((Movie)movie2);
		buyable.add((Game)game);
		buyable.add((Game)game2);
		
		System.out.println(movie.getInvestment());
		System.out.println(movie2.getInvestment());
		System.out.println(book.getInvestment());
		System.out.println(book2.getInvestment());
		System.out.println(game.getInvestment());
		System.out.println(game2.getInvestment());
		System.out.println(buyableProductsIncome(buyable));
	}
		
		public static int buyableProductsIncome(List<Buyable> buyable)
		{
			int total = 0;
			for (Buyable buyable2 : buyable) {
				total += buyable2.getPrice();
			}
			return total;
		}
	}
