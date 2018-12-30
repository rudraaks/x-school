package in.aks.xschool.common.dao.person;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import in.aks.xschool.common.dao.EntityDAO;
import in.aks.xschool.common.entities.person.Student;


@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class StudentDAO extends EntityDAO<Student>
{

	public List<Student> list()
	{
		return super.list(Student.class);
	}
}
