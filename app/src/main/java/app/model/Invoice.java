package app.model;

import java.sql.Date;

public class Invoice {
	private long id;
	private Pet petId;
	private Person ownerId;
	private Order orderId;
	private String items;
	private double amount;
	private Date date;

	public Invoice() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pet getPetId() {
		return petId;
	}

	public void setPetId(Pet petId) {
		this.petId = petId;
	}

	public Person getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Person ownerId) {
		this.ownerId = ownerId;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
