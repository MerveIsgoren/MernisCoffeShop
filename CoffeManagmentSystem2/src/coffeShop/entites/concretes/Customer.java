package coffeShop.entites.concretes;

import coffeShop.entites.abstracts.Entity;

public class Customer implements Entity{

	public int id;
	public String firstName;
	public String lastName;
	public int timeOfBirth;
	public String NationalityId;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String firstName, String lastName, int timeOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.timeOfBirth = timeOfBirth;
		NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(int timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
