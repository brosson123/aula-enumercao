package application;
import java.util.Date;
import entitis.Order;
import entitis.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1800, new Date(), OrderStatus.PEDING_PAYMET);
		
		System.out.println(order);

	}

}
