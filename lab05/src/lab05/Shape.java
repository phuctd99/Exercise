package lab05;

public class Shape {
	private String color;
	private boolean filled;
	Shape(){
		setColor("red");
		setFilled(true);
	}
	Shape(String color, boolean filled){
		this.setColor(color);
		this.setFilled(filled);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString(){
		return "color "+this.color+"\nfilled "+this.filled;
	}
}
