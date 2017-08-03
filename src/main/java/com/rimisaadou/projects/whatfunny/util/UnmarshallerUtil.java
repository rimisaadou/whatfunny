package com.rimisaadou.projects.whatfunny.util;

import java.io.StringReader;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

/**
 * Class that handles the unmarshalling of an xml string to a object.
 * @author rimi
 *
 */
public class UnmarshallerUtil {

	/**
	 * Unmarshall the provided xml content to a object.
	 * @param xml content as a string
	 * @param classToUnmarshall the class to unmarshall
	 * @return
	 * @throws JAXBException
	 */
	@SuppressWarnings("unchecked")
	public static <T>  T getObject(String xml, Class<?> classToUnmarshall) 
			throws JAXBException {

        StringReader reader = new StringReader(xml);
        return (T)JAXB.unmarshal(reader, classToUnmarshall);
	}

}
