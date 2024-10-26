package app.dto;

public class ClinicalHistoryDto {
	private long date;
	private PetDto petId;
	private UserDto veterinarian;
	private String reason;
	private OrderDto orderId;
	private String diagnosis;
	private String medicine;
	private String dose;
	private String procedureName;
	private String procedureDetail;
	private String status;
	private String vaccunation;
	private String alergies;
	
	public ClinicalHistoryDto() {}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public OrderDto getOrderId() {
		return orderId;
	}

	public void setOrderId(OrderDto orderId) {
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
