public abstract class Transmission {

    private String typeOfTransmission;
    private String modelNumber;
    private int noOfForwardGears;

    public Transmission(String typeOfTransmission, String modelNumber, int noOfForwardGears) {
        this.typeOfTransmission = typeOfTransmission;
        this.modelNumber = modelNumber;
        this.noOfForwardGears = noOfForwardGears;
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getNoOfForwardGears() {
        return noOfForwardGears;
    }

    public void setNoOfForwardGears(int noOfForwardGears) {
        this.noOfForwardGears = noOfForwardGears;
    }

    public abstract void showSpecs();

}
