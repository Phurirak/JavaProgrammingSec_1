import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number : ");
		int previosNumber = scan.nextInt();
		
		int currentNumber;
		
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previosNumber) {
				System.out.println("BYE BYE");
				break;
			}
			previosNumber = currentNumber;
			
		}

	}

}
