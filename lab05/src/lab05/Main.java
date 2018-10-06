package lab05;

public class Main {
	public static void main(String []args){
		Shape shape =new Shape();
		System.out.println("-----------------");
		System.out.println("Shape");
		System.out.println(shape.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Circle circle = new Circle(3);
		System.out.println(circle.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Rectangle rectangle = new Rectangle(4, 5, "blue", true);
		System.out.println(rectangle.toString());
		//
		System.out.println("-----------------");
		System.out.println("Shape");
		Square square = new Square(6);
		System.out.println(square.toString());
	}
}
