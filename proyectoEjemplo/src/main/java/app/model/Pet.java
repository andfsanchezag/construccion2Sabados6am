package app.model;

public class Pet {
	private long id;
	private Person ownerId;
	private String name;
	private int age;
	private String race;
	private String spice;
	private double weigth;
	private String features;

	public Pet() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Person ownerId) {
		this.ownerId = ownerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSpice() {
		return spice;
	}

	public void setSpice(String spice) {
		this.spice = spice;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

}
