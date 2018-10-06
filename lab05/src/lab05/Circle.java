package lab05;

public class Circle extends Shape{
	final double PI = 3.14;
	
	private double radius;
	Circle(){
		setRadius(1.0);
	}
	Circle(double radius){
		this.setRadius(radius);
	}
	Circle(double radius, String color, boolean filled){
		this.setRadius(radius);
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return (PI*radius*radius);
	}
	public double getPerimeter(){
		return (2*PI*radius);
	}
	public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
}
