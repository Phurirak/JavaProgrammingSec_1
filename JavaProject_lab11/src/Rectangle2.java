public class Rectangle2 implements Shape2 {
	
	private double width, lenght;
	
	Rectangle2(double width, double length){
		this.width = width;
		this.lenght = length;
	}
	
	@Override
	public double getArea() {
		return this.width * this.lenght;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.lenght;
	}
	
	public String toString() {
		return "Rectangle[width= "+this.width+ ",lenght= "+this.lenght+"]";
	}
	
}
