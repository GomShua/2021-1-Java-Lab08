package edu.handong.csee.java.hw2.converters;

/**
 * This interface contains the method that converting classes should implement
 */
public interface Convertible {
    /**
     * this method sets the original value
     * @param fromValue
     */
    public void setFromValue(double fromValue);

    /**
     * return the converted value
     * @return converted value
     */
    public double getConvertedValue();

    /**
     * It converts the value to another value.
     */
    public void convert();

}