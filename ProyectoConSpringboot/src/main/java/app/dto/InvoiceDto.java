package app.dto;

import java.sql.Date;

public class InvoiceDto {
	private long id;
	private PetDto petId;
	private PersonDto ownerId;
	private OrderDto orderId;
	private String items;
	private double amount;
	private Date date;

	public InvoiceDto() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PetDto getPetId() {
		return petId;
	}

	public void setPetId(PetDto petId) {
		this.petId = petId;
	}

	public PersonDto getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(PersonDto ownerId) {
		this.ownerId = ownerId;
	}

	public OrderDto getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderDto orderId) {
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
