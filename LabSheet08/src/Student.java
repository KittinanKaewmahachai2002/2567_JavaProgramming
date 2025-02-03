
public class Student {
	private String studentName;
	private int studentScore;
	
	//getter and setter
	public void setName(String stdName) {
		studentName = stdName;
	}
	public String getName() {
		return studentName;
	}
	public void setScore(int stdScore) {
		studentScore = stdScore;
	}
	public int getScore() {
		return studentScore;
	}
	
	//check score
	public boolean checkScore(){
		return getScore()>=0&&getScore()<=100;//return true
	}
	public boolean isPass() {
		return getScore()>=50;//return true
	}
	
	
}
