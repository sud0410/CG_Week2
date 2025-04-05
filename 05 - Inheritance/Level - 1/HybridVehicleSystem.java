interface Refuelable {
    void refuel();
}
class Vehicle1 {
    int maxSpeed;
    String model;
    Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
class ElectricVehicle extends Vehicle1 {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println(model + " is charging...");
    }
}
class PetrolVehicle extends Vehicle1 implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void refuel() {
        System.out.println(model + " fueling petrol");
    }
}
public class HybridVehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Honda city hybrid");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda brio");

        ev.charge();
        pv.refuel();
    }
}
