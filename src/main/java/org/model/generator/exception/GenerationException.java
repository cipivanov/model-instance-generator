package org.model.generator.exception;

public class GenerationException extends RuntimeException {

    public GenerationException(Exception exception) {
        super("Generation exception", exception);
    }
}
