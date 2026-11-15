package nestedinterface1;


public class CardPayment implements Order.PaymentRule {
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Card payment successful: "+ amount);
	}

}
