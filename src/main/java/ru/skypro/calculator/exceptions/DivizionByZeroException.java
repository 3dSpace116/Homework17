package ru.skypro.calculator.exceptions;

public class DivizionByZeroException extends IllegalArgumentException {
    public DivizionByZeroException() {
        super();
    }

    public DivizionByZeroException(String s) {
        super(s);
    }

    public DivizionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivizionByZeroException(Throwable cause) {
        super(cause);
    }

}
