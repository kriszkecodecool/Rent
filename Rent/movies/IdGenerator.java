package movies;

import java.util.UUID;

public class IdGenerator {
	
	public static String Generate(Product p){
		if (p instanceof Movie) {
			return "MOV"+UUID.randomUUID().toString();
		}
		else if (p instanceof Game) {
			return "GAM"+UUID.randomUUID().toString();
		}
		else if (p instanceof Book) {
			return "BOO"+UUID.randomUUID().toString();
		}
		return null;
	}
}
