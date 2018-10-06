package lab05;

public class Rectangle extends Shape{
	private double width;
	private double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	Rectangle(){
		this.width = 1.0;
		this.length = 1.0;
	}
	Rectangle(double width, double length, String color, boolean filled){
		this.width = width;
		this.length = length;
		this.setColor(color);
		this.setFilled(filled);
	}
	public double getArea(){
		return (width*length);
	}
	public double getPerimeter(){
		return (2*(width + length));
	}
	public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
}
