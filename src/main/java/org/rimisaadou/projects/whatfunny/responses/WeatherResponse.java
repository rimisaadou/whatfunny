package org.rimisaadou.projects.whatfunny.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WeatherResponse extends ResponseBase {

	private String additionalMessage;
	private int temperature;

	public WeatherResponse() {
		super("WeatherService");
	}

	public WeatherResponse(int temperature, String additionalMessage) {
		this();
		this.temperature = temperature;
		this.additionalMessage = additionalMessage;
	}

	public String getAdditionalMessage() {
		return additionalMessage;
	}

	public void setAdditionalMessage(String additionalMessage) {
		this.additionalMessage = additionalMessage;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
