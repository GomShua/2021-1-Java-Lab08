package edu.handong.csee.java.hw2.converters;

/**
 * This class convert mile to km.
 */
public class MILEToKMConverter implements Convertible{
    private double mile;
    private double km;

    /**
     * This method sets the value of the variable "mile".
     */
    public void setFromValue(double fromValue){
        mile = fromValue;
    }

    /**
     * This returns the value of converted km value from mile.
     */
    public double getConvertedValue(){
        return km;
    }

    /**
     * This method converts mile value to km value.
     */
    public void convert(){
        km = mile * 1.6;
    }
}
