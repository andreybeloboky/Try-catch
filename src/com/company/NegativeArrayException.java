package com.company;

public class NegativeArrayException extends Exception {
    public NegativeArrayException() {
    }

    public NegativeArrayException(String message) {
        super(message);
    }

    public NegativeArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeArrayException(Throwable cause) {
        super(cause);
    }

    public NegativeArrayException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
