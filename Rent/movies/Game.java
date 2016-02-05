package movies;

import java.util.List;

public class Game extends Product implements Buyable {
	boolean preOrdered;
	List<Person> Staff;
	int price;
	
	public boolean isPreOrdered() {
		return preOrdered;
	}
	public void setPreOrdered(boolean preOrdered) {
		this.preOrdered = preOrdered;
	}
	public List<Person> getStaff() {
		return Staff;
	}
	public void setStaff(List<Person> staff) {
		Staff = staff;
	}
	public int getPrice() {
		if (isPreOrdered()) {
			return (int)(price*0.8);
		}
		else return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	long getInvestment() {
		long total = 0;
		for (Person person : Staff) {
			total += person.getSalary();
		}
		return total;
	}
	
}
