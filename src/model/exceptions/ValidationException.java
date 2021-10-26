package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> Errors = new HashMap<>();
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return Errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		Errors.put(fieldName, errorMessage);
	}
}
