
public class DemoCar {
	public static void main(String[] args) {
		// สร้างออบเจ็กต์ Car โดยใช้ Constructor แบบกาหนดค่าพารามิเตอร์
		Car c1 = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		// แสดงข้อมูลเริ่มต้น
		System.out.println("Company Name: "+c1.getCompanyName());
		System.out.println("Model Name: "+c1.getModelName());
		System.out.println("Year: "+c1.getYear());
		System.out.println("Mileage: "+c1.getMileage());
		
		// อัปเดตข้อมูลใหม่ที่ถูกต้อง
		System.out.println();
		System.out.println("Updated Car Details:");
		c1.setCompanyName("Toyota");
		System.out.println("Company Name: "+c1.getCompanyName());
		c1.setModelName("Corolla");
		System.out.println("Model Name: "+c1.getModelName());
		c1.setYearsetYear(2015);
		System.out.println("Year: "+c1.getYear());
		// ทดสอบการตั้งค่าที่ไม่ถูกต้อง
		c1.setYearsetYear(1700);
		c1.setCompanyName("");
		c1.setModelName(null);
	}
}
