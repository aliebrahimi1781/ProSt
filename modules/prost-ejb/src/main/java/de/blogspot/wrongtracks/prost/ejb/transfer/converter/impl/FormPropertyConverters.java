package de.blogspot.wrongtracks.prost.ejb.transfer.converter.impl;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.form.FormProperty;
import org.activiti.engine.form.FormType;

import de.blogspot.wrongtracks.prost.ejb.transfer.FormPropertyTransfer;
import de.blogspot.wrongtracks.prost.ejb.transfer.converter.FormPropertyConverter;

/**
 * Klasse um aus {@link FormProperty} Objekten {@link FormPropertyTransfer}
 * Objekte zu erzeugen.
 * 
 * @author Ronny Bräunlich
 * 
 */
public class FormPropertyConverters {

	private static Map<Class<? extends FormType>, FormPropertyConverter<?>> converters
	= new HashMap<Class<? extends FormType>, FormPropertyConverter<?>>();

	public static FormPropertyTransfer convertProperty(FormProperty formProperty) {

		FormType formType = formProperty.getType();
		FormPropertyConverter<?> formPropertyConverter = converters.get(formType
				.getClass());
		FormPropertyTransfer transfer = formPropertyConverter
				.convert(formProperty);
		return transfer;
	}

	public static void addFormPropertyConverter(
			FormPropertyConverter<? extends FormType> converter) {
		converters.put(converter.getFormTypeClass(), converter);
	}

	public static void removeFormPropertyConverter(
			FormPropertyConverter<? extends FormType> converter) {
		converters.remove(converter);
	}

}
