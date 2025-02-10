
public class Person {
	String firstName,lastName;
	
	Person(){
		firstName = null;
		lastName = null;
	}
	Person(String first,String last){
		firstName = first;
		lastName = last;
	}
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return getFirstName()+" "+getLastName();
	}
}
