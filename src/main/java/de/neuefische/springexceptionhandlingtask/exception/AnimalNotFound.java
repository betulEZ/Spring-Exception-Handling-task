package de.neuefische.springexceptionhandlingtask.exception;

public class AnimalNotFound extends RuntimeException{
    public AnimalNotFound(String message) {
        super(message);
    }
}
