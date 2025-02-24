
public class Barista {
	private String name;
	private char gender;

	Barista(String name,char gender){
		this.name = name;
		this.gender = gender;
	}

	Barista(){
		this.name = null;
		this.gender = ' ';
	}

	public String getName() {
		return this.name;
	}

	public String getGenderName() {
		if(this.gender=='M'||this.gender=='m') {
			return "Male";
		}else if(this.gender=='F'||this.gender=='f') {
			return "Female";
		}else
			return null;
	}
}