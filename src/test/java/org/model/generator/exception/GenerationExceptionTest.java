package org.model.generator.exception;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerationExceptionTest {

    @Test
    public void shouldCreateGenerationExceptionWithCorrectCause() {
        GenerationException generationException = new GenerationException(new RuntimeException());
        assertThat(generationException.getCause()).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void shouldCreateGenerationExceptionWithMessage() {
        GenerationException generationException = new GenerationException(new RuntimeException());
        assertThat(generationException.getMessage()).isEqualTo("Generation exception");
    }

    @Test(expected = GenerationException.class)
    public void shouldThrowGenerationException() {
        GenerationException generationException = new GenerationException(new RuntimeException());
        throw generationException;
    }
}
