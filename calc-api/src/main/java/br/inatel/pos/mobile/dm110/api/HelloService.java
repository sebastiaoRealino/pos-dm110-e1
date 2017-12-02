package br.inatel.pos.mobile.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface HelloService {
	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum(@QueryParam("first") int num1, @QueryParam("second") int num2); 
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result buildSubMessage(@FormParam("first") String first, @FormParam("second") String second);
	
}