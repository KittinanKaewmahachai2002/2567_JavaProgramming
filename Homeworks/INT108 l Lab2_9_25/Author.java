
public class Author {
	private String name,email;
	
	Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	Author(){
		this.name = null;
		this.email = null;
	}
	public String getName() {
		return this.name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	public String toString() {
		return getEmail()+" ("+getEmail()+")";
	}
}
