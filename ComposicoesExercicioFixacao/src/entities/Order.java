package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;


public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> itens = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return itens;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}
	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	public void total() {
		
	}
	
	public String toString() {
		Double total= 0.00;
		StringBuilder sb = new StringBuilder();		
		sb.append("Order moment: "+sdf.format(getMoment()) +"\n");
		sb.append("Order satus: "+getStatus()+"\n");
		sb.append("Client: "+getClient()+"\n");
		sb.append("Order items: \n");		
		for(OrderItem c: itens) {

			sb.append(c.getProduct()+", ");
			sb.append("$"+ c.getPrice()+", ");
			sb.append("Quantity: "+c.getQuantity()+", ");
			sb.append("Subtotal: $"+c.subTotal()+"\n");
			total +=  c.subTotal();
		}
		sb.append("Total price: "+String.format("%.2f",total));
		return sb.toString();
	}
}
