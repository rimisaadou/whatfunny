package org.rimisaadou.projects.whatfunny.responses;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResponseBase {

	private String name;

	public ResponseBase() {
		
	}

	public ResponseBase(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
