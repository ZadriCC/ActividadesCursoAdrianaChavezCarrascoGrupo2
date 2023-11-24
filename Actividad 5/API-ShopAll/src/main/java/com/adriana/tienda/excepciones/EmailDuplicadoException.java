package com.adriana.tienda.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class EmailDuplicadoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmailDuplicadoException(String message) {
		super(message);
	}
}
