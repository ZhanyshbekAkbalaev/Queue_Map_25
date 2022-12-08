package lms;

public class Car {
    private int id;
    private int vehicleNumber;

    public Car(int id, int vehicleNumber) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return
                "Car\nid: " + id +
                "\nvehicleNumber: " + vehicleNumber;
    }
}
