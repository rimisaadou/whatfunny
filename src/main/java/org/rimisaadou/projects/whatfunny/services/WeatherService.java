package org.rimisaadou.projects.whatfunny.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;
import javax.servlet.http.HttpServletRequest;
import org.rimisaadou.projects.whatfunny.responses.WeatherResponse;

import com.rimisaadou.projects.whatfunny.util.IpAddressInformation;
import com.rimisaadou.projects.whatfunny.util.UnmarshallerUtil;

@Path("/weather")
public class WeatherService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{location}")
	public Response getWeather(@PathParam("location") String location, 
			@Context HttpServletRequest requestContext) throws JAXBException {

		String ipAddress = requestContext.getRemoteAddr();
		
		IpAddressInformation ob = UnmarshallerUtil.getObject("<Response> "
				+ "<IP>91.120.252.146</IP> "
				+ "<CountryCode>HU</CountryCode>"
				+ "<CountryName>Hungary</CountryName>"
				+ "<RegionCode>BU</RegionCode>"
				+ "<RegionName>Budapest</RegionName>"
				+ "<City>Budapest</City>"
				+ "<ZipCode>1012</ZipCode>"
				+ "<TimeZone>Europe/Budapest</TimeZone>"
				+ "<Latitude>47.5</Latitude>"
				+ "<Longitude>19.0833</Longitude>"
				+ "<MetroCode>0</MetroCode>"
				+ "</Response>", IpAddressInformation.class);

		return Response.status(200).entity(new WeatherResponse()).build();
	}

}
