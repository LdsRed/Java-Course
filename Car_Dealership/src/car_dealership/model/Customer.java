package car_dealership.model;

public class Customer {

    private String name;
    private String lastName;
    private String address;

    private double cashAvailable;


    public Customer() {}


    public Customer(String name, String lastName, String address, double cashAvailable) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.cashAvailable = cashAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashAvailable() {
        return cashAvailable;
    }

    public void setCashAvailable(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public void buyVehicle(Vehicle vehicle, Customer customer, boolean finance) {

    }

    
}
