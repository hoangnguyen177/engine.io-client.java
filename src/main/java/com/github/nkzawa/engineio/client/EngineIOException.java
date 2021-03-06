package com.github.nkzawa.engineio.client;

public class EngineIOException extends Exception {

    public EngineIOException() {
        super();
    }

    public EngineIOException(String message) {
        super(message);
    }

    public EngineIOException(String message, Throwable cause) {
        super(message, cause);
    }

    public EngineIOException(Throwable cause) {
        super(cause);
    }
}
