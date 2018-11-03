package com.ziemo.baller.nbamanager.common;

public class ObjectNotExistException extends Exception {

	public ObjectNotExistException(String message) {
		super(message);
	}

	public ObjectNotExistException() {
		super("Object with the given id not exist");
	}
}
