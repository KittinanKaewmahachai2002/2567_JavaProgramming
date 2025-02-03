
public class Car {
	
	private String companyName,modelName;
	private int year;
	private double mileage;
	
	Car(String companyName, String modelName, int year, double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		this.year = (year < 1886 ? year : 2000);
		this.mileage = mileage;
	}
	
	Car(){
		this.companyName = "Unknown";
		this.modelName = "Unknown";
		this.year = 2000;
		this.mileage = 0.0;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		if(companyName == null||companyName.trim().isEmpty()) {
			System.out.println("Error: Invalid company or model name!");
		}else {
			this.companyName = companyName;
		}
	}
	
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		if(modelName == null||modelName.trim().isEmpty()) {
			System.out.println("Error: Invalid company or model name!");
		}else {
			this.modelName = modelName;
		}
	}
	
	public int getYear() {
		return this.year;
	}
	public void setYearsetYear(int year) {
		if(year < 1886) {
			System.out.println("Error: Invalid year!");
		}else {
			this.year = year;
		}
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
}
