package in.aks.xschool.module.student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class HelloRestService
{

	@GET
	@Path("/{msg}")
	public Response getMessage(@PathParam("msg") String message)
	{
		return Response.status(200).entity("msg: " + message).build();
	}
}
