package constructor.level1;


class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rate = 1000;

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    double totalCost() {
        return rentalDays * rate;
    }

    void display() {
        System.out.println(customerName + " " + carModel);
        System.out.println("Total Cost: " + totalCost());
    }
}