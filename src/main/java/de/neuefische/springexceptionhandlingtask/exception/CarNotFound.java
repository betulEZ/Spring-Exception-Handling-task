package de.neuefische.springexceptionhandlingtask.exception;

public class CarNotFound extends RuntimeException{
    public CarNotFound(String message) {
        super(message);
    }
}
