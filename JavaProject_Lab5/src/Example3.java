import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//1.input email
		String yourEmail = JOptionPane.showInputDialog("Input your email: ");
		//2.check email
		while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")) {
			yourEmail = JOptionPane.showInputDialog("Input your email,again: ");
		}
		//3.check email that is hotmail or gmail or not
		yourEmail= yourEmail.toLowerCase();
		if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+yourEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}


	}

}