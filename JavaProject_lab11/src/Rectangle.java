public class Rectangle extends Shape {
	
	private double width;
	private double lenght;
	
	Rectangle(double width, double lenght, String color){
		super(color);
		this.width = width;
		this.lenght = lenght;
	}
	
	@Override
	public double getArea() { //method getArea() --> abstract method from Superclass
		return this.width * this.lenght;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width= "+this.width+ ",lenght= "+this.lenght+","+super.toString()+"]";
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.lenght;
	}
	
}
