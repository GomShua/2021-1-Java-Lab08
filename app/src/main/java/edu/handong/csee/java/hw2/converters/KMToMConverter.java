package edu.handong.csee.java.hw2.converters;

/**
 * This class convert KM to M.
 */
public class KMToMConverter implements Convertible{
    private double km;
    private double m;

    /**
     * This method sets the value of the variable "km".
     */
    public void setFromValue(double fromValue){
        km = fromValue;
    }

    /**
     * This returns the value of converted m value from km.
     */
    public double getConvertedValue(){
        return m;
    }

    /**
     * This method converts km value to m value.
     */
    public void convert(){
        m = km * (double)1000;
    }
}
