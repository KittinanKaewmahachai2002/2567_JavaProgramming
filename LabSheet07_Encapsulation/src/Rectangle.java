
public class Rectangle {
	//Create two private attribute
	private float length;
	private float width;
	
	//Default Constructor
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}
	//Parameterized Constructor
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	//Getters and Setters Method
	public float getLenght() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth(){
		return this.width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	//Method to calculate Area
	public double getArea() {
		return this.width*this.length;
	}
	//Method to calculate Perimeter
	public double getPerimeter() {
		return 2*(this.width+this.length);
	}
	
	//Method toString()
	public String toString() {
		return "Rectangle[length="+this.length+",width="+this.width+"]";
	}
	
	
	
	
	
	

}
