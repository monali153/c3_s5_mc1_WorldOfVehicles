public class ManualTransmission extends Transmission {

    private double[] mp4Model = {2.540, 1.920, 1.510, 1.000};
    private double[] mp5Model = {3.545, 1.904, 1.280, 0.914, 0.757};
    private double[] mp6Model = {3.010, 2.070, 1.430, 1.000, 0.710, 0.570};
    private double[] md5Model = {3.545, 1.904, 1.233, 0.911, 0.725};
    private double[] md6Model = {3.640, 2.150, 1.360, 1.000, 0.750, 0.630};


    public ManualTransmission(String typeOfTransmission, String modelNumber, int noOfForwardGears) {
        super(typeOfTransmission, modelNumber, noOfForwardGears);
    }

    public double[] getMp4Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            response[i] = mp4Model[i];
        }
        return response;
    }

    public void setMp4Model(double[] mp4Model) {
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            this.mp4Model[i] = mp4Model[i];
        }

    }

    public double[] getMp5Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            response[i] = mp5Model[i];
        }
        return response;
    }

    public void setMp5Model(double[] mp5Model) {
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            this.mp5Model[i] = mp5Model[i];
        }
    }

    public double[] getMp6Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            response[i] = mp6Model[i];
        }
        return response;
    }

    public void setMp6Model(double[] mp6Model) {
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            this.mp6Model[i] = mp6Model[i];
        }
    }

    public double[] getMd5Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            response[i] = mp5Model[i];
        }
        return response;
    }

    public void setMd5Model(double[] md5Model) {
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            this.md5Model[i] = md5Model[i];
        }
    }

    public double[] getMd6Model() {
        double[] response = new double[getNoOfForwardGears()];
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            response[i] = mp6Model[i];
        }
        return response;
    }

    public void setMd6Model(double[] md6Model) {
        for (int i = 1; i <= getNoOfForwardGears(); i++) {
            this.md6Model[i] = md6Model[i];
        }
    }

    @Override
    public void showSpecs() {
        System.out.println("\nTransmission Type: " + getTypeOfTransmission());
        System.out.println("Transmission Model Number: " + getModelNumber() + "#");
        System.out.println("Key Specifications:");
        System.out.println("1. Forward Gears " + getNoOfForwardGears());
        if (getModelNumber() == "MP4") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + mp4Model[i]);
            }
        } else if (getModelNumber() == "MP5") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + mp5Model[i]);
            }
        } else if (getModelNumber() == "MP6") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + mp6Model[i]);
            }
        } else if (getModelNumber() == "MD5") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + md5Model[i]);
            }
        } else if (getModelNumber() == "MD6") {
            for (int i = 0; i < getNoOfForwardGears(); i++) {
                System.out.println((i + 2) + ". " + (i + 1) + " Gear Ratio " + md6Model[i]);
            }
        }
    }
}
