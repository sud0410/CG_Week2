class CarRental {
    String customerName, carModel;
    int rentalDays;
    double costPerDay = 150;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days. Total: $" + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental = new CarRental("sudarsan", "la lamborghini ", 5);
        rental.display();
    }
}
