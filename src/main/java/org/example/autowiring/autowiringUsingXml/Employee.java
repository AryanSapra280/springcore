package org.example.autowiring.autowiringUsingXml;

public class Employee {
    private Address address;

    public Employee() {
        super();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
