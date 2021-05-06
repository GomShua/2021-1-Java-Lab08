package edu.handong.csee.java.hw2.converters;

/**
 * This class convert ton to kg.
 */
public class TONToKGConverter implements Convertible{
    private double ton;
    private double kg;

    /**
     * This method sets the value of the variable "ton".
     */
    public void setFromValue(double fromValue){
        ton = fromValue;
    }

    /**
     * This returns the value of converted kg value from ton.
     */
    public double getConvertedValue(){
        return kg;
    }

    /**
     * This method converts ton value to kg value.
     */
    public void convert(){
        kg = ton * (double)1000;
    }
}
