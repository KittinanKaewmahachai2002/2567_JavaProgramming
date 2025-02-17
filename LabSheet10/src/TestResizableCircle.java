
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle re = new ResizableCircle(10.0);
		
		System.out.println(re);
		System.out.printf("Perimeter: %.14f%n",re.getPerimeter());
		System.out.printf("Area: %.14f%n",re.getPerimeter());
		re.resize(50);
		System.out.println("After resize(50%): "+re);
		System.out.printf("Perimeter: %.14f%n",re.getPerimeter());
		System.out.printf("Area: %.14f%n",re.getArea());

	}

}
