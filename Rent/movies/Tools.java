package movies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools {
	
	public static String toXMLTag(String String1, String String2){
		return "<"+String1+"><"+""+String2+"><"+String1+">";
	}
	
	public static String[] getMovieTitles(ArrayList<Movie> movies) {
		int listLength = movies.size();
		String[] result = new String[listLength];

		for (int i = 0; i < listLength; i++) {
			result[i] = movies.get(i).getTitle();
		}
		return result;
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies) {
		HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
		for (Movie movie : movies)
		{
			for (Person person : movie.getCast())
			{
				if (!countMap.containsKey(person))
				{
				  countMap.put(person, new Integer(0));
				}
				countMap.put(person, countMap.get(person) + 1);
			}
		}
		return countMap;
	}
}
