import java.text.DecimalFormat;
import javax.swing.*;
public class Example3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Hight: "));
		height = height/100;
		double bmi = weight/(height*height);
		String bmiCategory;
		if(bmi<18.5)bmiCategory = "Underweight";
		else if (bmi<25)bmiCategory = "normal-weight";
		else if (bmi<30)bmiCategory = "Overweight";
		else bmiCategory = "obesity";
		JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi) +"\nYou're "+bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
		

	}

}
