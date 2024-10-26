package app.dto;

import java.sql.Date;

public class OrderDto {
	private long id;
	private PetDto petId;
	private UserDto veterinarian;
	private PersonDto ownerId;
	private String dose;
	private String medicine;
	private Date date;

	public OrderDto() {
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

	public UserDto getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(UserDto veterinarian) {
		this.veterinarian = veterinarian;
	}

	public PersonDto getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(PersonDto ownerId) {
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
