package com.rimisaadou.projects.whatfunny.externalservices.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "Response" )
public class IpAddressInformation {

	private String ip;
	private String CountryCode;
	private String countryName;
	private String regionCode;
	private String regionName;
	private String city;
	private String zipcode;
	private String timeZone;
	private String latitude;
	private String longitude;
	private int metroCode;

	@XmlElement( name = "IP" )
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	@XmlElement( name = "CountryCode" )
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	@XmlElement( name = "CountryName" )
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRegionCode() {
		return regionCode;
	}

	@XmlElement( name = "RegionCode" )
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	@XmlElement( name = "RegionName" )
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCity() {
		return city;
	}

	@XmlElement( name = "City" )
	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	@XmlElement( name = "ZipCode" )
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	@XmlElement( name = "TimeZone" )
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLatitude() {
		return latitude;
	}

	@XmlElement( name = "Latitude" )
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	@XmlElement( name = "Longitude" )
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getMetroCode() {
		return metroCode;
	}

	@XmlElement( name = "MetroCode" )
	public void setMetroCode(int metroCode) {
		this.metroCode = metroCode;
	}

}
