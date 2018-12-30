package in.aks.xschool.common.entities.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import in.aks.xschool.common.entities.IdEntity;

@Entity
@Table(name = "TEACHER")
public class Teacher extends IdEntity
{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "TEACHERNUMBER", nullable = false)
	private long teacherNumber;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON")
	private Person person;

	public long getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(long teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

}
