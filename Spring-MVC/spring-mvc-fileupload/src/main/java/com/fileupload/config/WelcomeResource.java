Wpackage com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/welcome")
public class WelcomeResource {

	public WelcomeResource() {
		System.out.println("WelcomeResource :: Constructor");
	}

	@GET
	public Response wish() {
		System.out.println("wish method got called....");
		String msg = "<h1>Welcome to Restful services</h1>";
		return Response.ok(msg).build();
	}

	// http://localhost:8086/Restful-Services-First-Jersey-Web-App/rest/welcome
}
