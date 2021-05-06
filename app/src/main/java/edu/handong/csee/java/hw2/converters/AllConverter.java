package edu.handong.csee.java.hw2.converters;

/**
 * This class allows user to convert value more than two at the same time.
 */
public class AllConverter {
    private double value;
    private String measure;

    /**
     * This method sets the value of variable "value".
     * @param fromValue
     * @return this value returns its class to implement chaning method.
     */
    public AllConverter setFromValue(double fromValue){
        value = fromValue;
        return this;
    }

    /**
     * This method set the original measurement of the value and store it in "measure"
     * @param originalMeasure
     * @return this value returns its class to implement chaning method.
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        measure = originalMeasure;
        return this;
    }

    /**
     * This method convert the value based on the variables "value" and "measure" and print out the result of conversion.
     */
    public void convertAndPrintOut(){
        if(measure.equals("KM")){
            System.out.println(value + " KM to " + value * (double) 1000 + " M");
            System.out.println(value + " KM to " + value / 1.6 + " MILE");
        }else if(measure.equals("TON")){
            System.out.println(value + " TON to " + value * (double) 1000 + " KG");
            System.out.println(value + " TON to " + value * (double) 1000000 + " G");
        }else{
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}
