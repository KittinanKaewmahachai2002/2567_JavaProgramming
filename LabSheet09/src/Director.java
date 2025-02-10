
public class Director {
	String name,email;
	char gender;
	
	Director(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	Director(String name,String email){
		this(name,email,'a');
	}
	
	public String getName() {
		return this.name; 
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(this.gender=='M'||gender=='m') {
			return "Male";
		}else if(this.gender=='F'||gender=='f') {
			return "Female";
		}else {
			return null;
		}
	}
	
	public String toString() {
		return getName()+"("+getEmail()+";"+getGenderName()+")";
	}
}
