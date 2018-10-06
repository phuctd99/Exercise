package lab05;

public class Square extends Rectangle{
	private double side;
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	Square(){
		this.side = 1.0;
	}
	Square(double side){
		this.side = side;
	}
	Square(double side, String color, boolean filled){
		this.side = side;
		this.setColor(color);
		this.setFilled(filled);
	}
	public void setWidth(double side){
		this.setWidth(side);
	}
	public void setLength(double side){
		this.setLength(side);
	}
	public String toString(){
		return "color "+this.getColor()+"\nfilled "+this.isFilled()
				+"\nArena "+this.getArea()+"\nPerimeter "+this.getPerimeter();
	}
}
