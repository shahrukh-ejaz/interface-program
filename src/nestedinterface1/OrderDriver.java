package nestedinterface1;

public class OrderDriver {
	
	public static void main(String[] args) {
		
		Order order = new Order(501);
		
		Order.PaymentRule payment = new CardPayment();
		
		order.showOrder();
		payment.processPayment(2500);
	}

}
