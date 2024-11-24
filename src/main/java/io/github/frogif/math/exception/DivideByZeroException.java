package io.github.frogif.math.exception;

/**
 * 除以0时出现的异常
 */
public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("/ by zero");
    }

}
