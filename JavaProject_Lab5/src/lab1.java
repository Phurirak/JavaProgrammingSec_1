import java.util.*;
import javax.swing.*;
public class lab1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}else {
			 String firstName = fullname.substring(0,space);
	         String lastName = fullname.substring(space, fullname.length());
	         System.out.println("FirstName: " + firstName);
	         System.out.println("LastName: " + lastName);
		}

	}

}
