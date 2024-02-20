package de.neuefische.springexceptionhandlingtask.exception;

public class SpeciesNotDogException extends RuntimeException{
    public SpeciesNotDogException(String message) {
        super(message);
    }
}
