package in.aks.xschool.common.entities.person;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import in.aks.xschool.common.entities.IdEntity;

@Entity
@Table(name = "PERSON")
public class Person extends IdEntity
{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	public static enum Gender
	{
		MALE,
		FEMALE,
		TRASGENDER
	}
	
	@Column(name = "GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Embedded
	private ContactAddress address;

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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public ContactAddress getAddress() {
		return address;
	}

	public void setAddress(ContactAddress address) {
		this.address = address;
	}
	
}
