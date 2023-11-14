import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input product name : ");
		String strUnit = JOptionPane.showInputDialog("Input product unit");
		int productUnit = Integer.parseInt(strUnit);
		String strPrice = JOptionPane.showInputDialog("Input price per unit");
		float priceperUnit = Integer.parseInt(strPrice);
		float totalPrice = productUnit * priceperUnit;
		JOptionPane.showMessageDialog(null,"Total Price is"+ totalPrice);

	}

}
