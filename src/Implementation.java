public class Implementation {

    public static void main(String[] args) {

        ManualTransmission manualTransmission = new ManualTransmission("Manual", "MP4", 4);

        manualTransmission.showSpecs();

        AmtTransmission amtTransmission = new AmtTransmission("Automatic", "AMTD5", 5);

        amtTransmission.showSpecs();


    }
}
