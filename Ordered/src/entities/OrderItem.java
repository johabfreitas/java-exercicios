package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private List<Product> product = new ArrayList<>();

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}

}
