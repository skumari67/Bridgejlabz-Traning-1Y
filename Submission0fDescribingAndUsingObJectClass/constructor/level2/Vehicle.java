package constructor.level2;


class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 500;

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}