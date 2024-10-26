package app.model;

public class ClinicalHistory {
	private long date;
	private Pet petId;
	private User veterinarian;
	private String reason;
	private Order orderId;
	private String diagnosis;
	private String medicine;
	private String dose;
	private String procedureName;
	private String procedureDetail;
	private String status;
	private String vaccunation;
	private String alergies;
	
	public ClinicalHistory() {}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Order getOrderId() {
		return orderId;
	}

	public void setOrderId(Order orderId) {
		this.orderId = orderId;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getProcedureName() {
		return procedureName;
	}

	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getProcedureDetail() {
		return procedureDetail;
	}

	public void setProcedureDetail(String procedureDetail) {
		this.procedureDetail = procedureDetail;
	}

	public String isStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVaccunation() {
		return vaccunation;
	}

	public void setVaccunation(String vaccunation) {
		this.vaccunation = vaccunation;
	}

	public String getAlergies() {
		return alergies;
	}

	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}
	
	
}
