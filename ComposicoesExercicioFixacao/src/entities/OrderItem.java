package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}
	public Double subTotal() {
		return price * quantity;
	}
	/*public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName()+", ");
		sb.append("$"+price+", ");
		sb.append("Quantity: "+quantity+", ");
		sb.append("Subtotal: $"+subTotal());
		return sb.toString();
	}*/
}
