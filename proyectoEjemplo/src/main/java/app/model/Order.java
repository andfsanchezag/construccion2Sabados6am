package app.model;

import java.sql.Date;

public class Order {
	private long id;
	private Pet petId;
	private User veterinarian;
	private Person ownerId;
	private String dose;
	private String medicine;
	private Date date;

	public Order() {
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

	public User getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(User veterinarian) {
		this.veterinarian = veterinarian;
	}

	public Person getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Person ownerId) {
		this.ownerId = ownerId;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
