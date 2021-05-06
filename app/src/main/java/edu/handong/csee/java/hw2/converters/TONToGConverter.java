package edu.handong.csee.java.hw2.converters;

/**
 * This class convert ton to g.
 */
public class TONToGConverter implements Convertible{
    private double ton;
    private double g;

    /**
     * This method sets the value of the variable "ton".
     */
    public void setFromValue(double fromValue){
        ton = fromValue;
    }

    /**
     * This returns the value of converted g value from ton.
     */
    public double getConvertedValue(){
        return g;
    }

    /**
     * This method converts ton value to g value.
     */
    public void convert(){
        g = ton * (double)1000000;
    }
}
