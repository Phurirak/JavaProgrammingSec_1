import java.time.Year;

public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String titel;
	private int publicYear;
	
	int space = author_name.indexOf(' ');
	
	String fristName = author_name.substring(0,space);
	String lastName = author_name.substring(space,author_name.length()-1);
	Year currentYear = Year.now();
	String abbreviatlastname = lastname.substring(space+1)+".";
	
	FictionBook(String titel, int publicYear) {
		this.titel = titel;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name) {
		author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if (space == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getLastName() {
		return lastName = lastName.toUpperCase();
	}
	
	public String getFristName() {
		return fristName = fristName.toUpperCase();
	}
	
	public boolean checkEmail() {
		if (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int totalPublicYear() {
		return currentYear.getValue() - publicYear;
	}
	
	public String toString() {
		return title+"write by"+abbreviatlastname+firstname+"("+email+")"+"Published for "+totalPublicYear()+"year.";
	}
	
}
