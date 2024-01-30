import javax.swing.*;
public class RectangleDemo {
	public static void main(String[] args) {
		//Input all data from dialog box
		//double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		//double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		//String colorInput = JOptionPane.showInputDialog("Input color");
		
		//Send 3-argument to Constructor
		//Rectangle obj1 = new Rectangle(widthInput, lengthInput, colorInput);
		
		//Show the width, length and color
		//JOptionPane.showConfirmDialog(null, obj1.toString()+"\nArea of Rectangle = "+ obj1.getArea());
		
		//Input data using interface class
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput, lengthInput);
		JOptionPane.showConfirmDialog(null, obj2.toString()+"\nArea of Rectangle = "+ obj2.getArea());
	}

}
