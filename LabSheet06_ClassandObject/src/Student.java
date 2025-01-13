
public class Student {
	private String name;
	private double[] scores;
	
	//Method to set student details
	public void setStudentDetails(String stdName, double[] stdScores) {
		name = stdName;
		scores = stdScores;
	}
	
	//Method to calculate average score
	public double calculateAverageScore() {
		//variable
		double total = 0;
		/*for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}*/
		for(double _score:scores) {
			total+=_score;
		}
		return total/scores.length;
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average >= 80) {
			return "A";
		}else if(average >= 70) {
			return "B";
		}else if(average >= 60) {
			return "C";
		}else if(average >= 50) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public void displayStudentDetails() {
		System.out.println("Name: "+name);
		/*for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}*/
		for(double _scores:scores) {
			System.out.print(_scores+" ");
		}
		System.out.println("\nAverage Score : "+ calculateAverageScore());
		System.out.println("Grade: "+getGrade());
		
		
		
		
		
		
		
		
	}
}
