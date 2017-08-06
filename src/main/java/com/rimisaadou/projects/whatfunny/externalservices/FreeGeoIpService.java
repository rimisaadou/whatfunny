package com.rimisaadou.projects.whatfunny.externalservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class contains method that can be used to call FreeGeoIp API services.
 * @author rimi
 *
 */
public class FreeGeoIpService {
	private static final String[] IPSERVICES = { "http://freegeoip.net/xml/%s" };

	/**
	 * Method that returns the IP address information by calling freegeoip.net api.
	 * @param ipAddress IP address to search for.
	 * @return
	 */
	public static String getIpAddressInformation(String ipAddress) {
		return getIpAddressInformation(0, ipAddress);
	}

	/**
	 * Method that returns the ip address information by calling freegeoip.net api.
	 * @param counter services count
	 * @param ipAddress Ip address to search for.
	 * @return
	 */
	private static String getIpAddressInformation(int counter, String ipAddress) {

		if (counter >= IPSERVICES.length) {
			return null;
		}

		String service = String.format(IPSERVICES[counter], ipAddress);
		URL whatismyip = null;

		try {
			whatismyip = new URL(service);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

		if (whatismyip == null) {
			return getIpAddressInformation(++counter, ipAddress);
		} else {
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(whatismyip.openStream()))) {

				String inputLine;
				StringBuilder xmlContent = new StringBuilder();
				while ((inputLine = in.readLine()) != null) {
					xmlContent.append(inputLine);
				}

				return xmlContent.toString();

			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}

			return getIpAddressInformation(++counter, ipAddress);
		}
	}

}
