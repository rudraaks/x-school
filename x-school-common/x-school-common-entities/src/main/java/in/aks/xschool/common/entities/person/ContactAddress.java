package in.aks.xschool.common.entities.person;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactAddress 
{

	@Column
	private Long phoneNumber1;
	
	@Column
	private Long phoneNumber2;
	
	@Column
	private Long mobileNumber;

	public Long getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(Long phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public Long getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(Long phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	

}
