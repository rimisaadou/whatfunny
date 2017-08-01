package org.rimisaadou.projects.whatfunny.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.rimisaadou.projects.whatfunny.responses.WeatherResponse;

@Path("/weather")
public class WeatherService {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{location}")
	public Response getWeather(@PathParam("location") String location) {
		return Response.status(200).entity(new WeatherResponse()).build();
	}

}
