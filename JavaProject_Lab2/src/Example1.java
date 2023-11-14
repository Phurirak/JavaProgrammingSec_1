
public class Example1 {

	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1", title="Dasic Java Programming";
		int unit=5;
		//float price = 225.76f;
		double price = 225.75;
		System.out.println("book ISBN : "+isbn);
		System.out.println("book Title : "+title);
		System.out.println("book Unit : "+unit);
		System.out.println("book Price : "+price);
		System.out.println("--------------------------");
		double totalPrice = unit * price;
		System.out.println("Total price is "+totalPrice);
		double vat = totalPrice+(totalPrice*7/100);//calculate vat in baht
		System.out.println("Add VAT 7% is "+vat);

	}

}
