package in.aks.xschool.module.student;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import in.aks.xschool.common.dao.person.StudentDAO;
import in.aks.xschool.common.entities.person.Student;

@Path("/student")
public class StudentRestService
{
	private static final Logger log = LoggerFactory.getLogger(StudentRestService.class);

	@Inject
	private StudentDAO studentDAO;
	
	@GET
	@Path("/list")
	public List<Student> list()
	{
		List<Student> list = studentDAO.list();
		if(list.isEmpty())
			log.info("Empty list of student");
		return null;
	}
}
