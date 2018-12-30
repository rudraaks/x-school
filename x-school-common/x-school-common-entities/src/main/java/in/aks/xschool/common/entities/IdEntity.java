package in.aks.xschool.common.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class IdEntity implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	
	@Column(nullable = false, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date createdAt;
	
	@OneToOne
	@JoinColumn(name = "createdBy", referencedColumnName = "id")
	private Account createdBy;

	@Column(nullable = false, insertable = false, updatable = false)
	@Temporal(TemporalType.DATE)
	private Date lastModifiedAt;

	@OneToOne
	@JoinColumn(name = "lastModifiedBy", referencedColumnName = "id")
	private Account lastModifiedBy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastModifiedBy() {
		return lastModifiedAt;
	}

	public void setLastModifiedBy(Date lastModifiedBy) {
		this.lastModifiedAt = lastModifiedBy;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public void setLastModifiedBy(Account lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

}
