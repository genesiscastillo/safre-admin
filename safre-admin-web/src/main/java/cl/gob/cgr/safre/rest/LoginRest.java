package cl.gob.cgr.safre.rest;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import cl.gob.cgr.common.vo.login.LoginVO;


@Path("/login")
public class LoginRest {
	
	private static final Logger LOGGER = Logger.getLogger(LoginRest.class.getName());
	

	@POST
	@Path("/metodo")
	@Consumes("application/json")
	public Response validarLogin(LoginVO loginVO ) {
		String welcome = "{\"campo\"=\"valor\"}"; 
		return Response.status(201).entity(welcome).build();
	}
}
