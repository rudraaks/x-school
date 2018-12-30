package in.aks.xschool.common.entities.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import in.aks.xschool.common.entities.IdEntity;

@Entity
@Table(name = "STUDENT")
public class Student extends IdEntity
{
	private static final long serialVersionUID = 1L;

	@Column(name = "STUDENTNUMBER", nullable = false)
	private long studentNumber;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "person")
	private Person person;

	public long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
