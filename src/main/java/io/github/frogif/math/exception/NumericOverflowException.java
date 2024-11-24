package io.github.frogif.math.exception;

/**
 * 数据溢出异常
 */
public class NumericOverflowException extends ArithmeticException{
    

    public NumericOverflowException(){
        super("out of system express range.");
    }

    public NumericOverflowException(String msg){
        super(msg);
    }

}
