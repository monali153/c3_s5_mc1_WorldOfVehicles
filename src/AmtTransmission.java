public class AmtTransmission extends Transmission {

    private double[] amtp4Model = {2.540, 1.920, 1.510, 1.000};
    private double[] amtd5Model = {2.650, 1.940, 1.340, 1.000, 0.630};
    private double[] cvt6Model = {2.631, 1.440, 1.165, 0.906, 0.680, 0.499};
    private double[] dct8Model = {4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667};

    public AmtTransmission(String typeOfTransmission, String modelNumber, int noOfForwardGears) {
        super(typeOfTransmission, modelNumber, noOfForwardGears);
    }

    public double[] getAmtp4Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            response[i] = amtp4Model[i];
        }
        return response;
    }

    public void setAmtp4Model(double[] amtp4Model) {
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            this.amtp4Model[i] = amtp4Model[i];
        }
    }

    public double[] getAmtd5Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            response[i] = amtd5Model[i];
        }
        return response;
    }

    public void setAmtd5Model(double[] amtd5Model) {
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            this.amtd5Model[i] = amtd5Model[i];
        }
    }

    public double[] getCvt6Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            response[i] = cvt6Model[i];
        }
        return response;
    }

    public void setCvt6Model(double[] cvt6Model) {
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            this.cvt6Model[i] = cvt6Model[i];
        }
    }

    public double[] getDct8Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            response[i] = dct8Model[i];
        }
        return response;
    }

    public void setDct8Model(double[] dct8Model) {
        for (int i = 0; i < getNoOfForwardGears(); i++) {
            this.dct8Model[i] = dct8Model[i];
        }
    }

    @Override
    public void showSpecs() {
        System.out.println("\nTransmission Type: " + getTypeOfTransmission());
        System.out.println("Transmission Model Number: " + getModelNumber() + "#");
        System.out.println("\nKey Specifications:");
        System.out.println("1. Forward Gears " + getNoOfForwardGears());
        if (getModelNumber() == "AMTP4") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + amtp4Model[i]);
            }
        } else if (getModelNumber() == "AMTD5") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + amtd5Model[i]);
            }
        } else if (getModelNumber() == "CVT6") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + "st Gear Ratio " + cvt6Model[i]);
            }
        } else if (getModelNumber() == "DCT8") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + dct8Model[i]);
            }
        }
    }
}
