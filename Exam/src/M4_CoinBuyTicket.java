import java.util.Scanner;

public class M4_CoinBuyTicket {

	public static void main(String[] args) {
		
		System.out.println("M4. 祑刽禦ó布");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("块布基 P");
		int ticketPrice = Integer.valueOf(scanner.nextLine());
		
		int ten = ticketPrice / 10;
		int five = (ticketPrice - (ten * 10)) / 5;
		int one = ticketPrice - (ten * 10) - (five * 5);
		
		System.out.println("ó布┮惠羆祑刽计秖" + (ten + five + one) + "猅");
		System.out.println("10 じ祑刽计秖  = " + ten);
		System.out.println("5 じ祑刽计秖  = " + five);
		System.out.println("1 じ祑刽计秖  = " + one);
	}
	
}
