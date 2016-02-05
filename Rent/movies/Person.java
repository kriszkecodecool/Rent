package movies;

public class Person {
	String firstName;
	String lastName;
	enum Gender {
		MALE,
		FEMALE
	}
	Gender gender;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	int salary;
	public static final String file = "movies.xml";
	
	public static void main(String[] args) {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String toXmlString(){
	    StringBuilder sb = new StringBuilder();
	    sb.append("<person>");
	    sb.append(Tools.toXMLTag("firstName", getFirstName()));
	    sb.append(Tools.toXMLTag("lastName", getLastName()));
	    sb.append(Tools.toXMLTag("gender", String.valueOf(getGender())));
	    sb.append("</person>");
	    return sb.toString();
	}
	
}
