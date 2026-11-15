package nestedinterface1;

public class Order {
	
	private int orderId;
	
	public Order(int orderId) {
		this.orderId = orderId;
	}
	
	public interface PaymentRule{
		void processPayment(double amount);

	}
	
	public void showOrder() {
		
		System.out.println("Order ID: "+ orderId);
	}
}
