
public class TestDate {

	public static void main(String[] args) {
		// test constructor and toString()
		Date d1 = new Date (2023,2,8);
		System.out.print(d1);
		
		d1.setYear(2021);
		d1.setMonth(12);
		d1.setDay(23);
		
		System.out.println(d1);
		System.out.println();
		
		System.out.println("Year is: "+d1)
		

	}

}
