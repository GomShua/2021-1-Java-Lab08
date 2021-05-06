package edu.handong.csee.java.hw2.converters;

/**
 * This class convert km to mile.
 */
public class KMToMILEConverter implements Convertible{
    private double km;
    private double mile;

    /**
     * This method sets the value of the variable "km".
     */
    public void setFromValue(double fromValue){
        km = fromValue;
    }

    /**
     * This returns the value of converted mile value from km.
     */
    public double getConvertedValue(){
        return mile;
    }

    /**
     * This method converts km value to mile value.
     */
    public void convert(){
        mile = km / 1.6;
    }
}
