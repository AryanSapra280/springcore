package org.example.constructorInjection;

import org.example.setterInjection.Address;

public class Person {
    private String name;
    private Integer id;
    private Address address;
    public Person() {
        super();
    }

    public Person(String name, Integer id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

  /*
    we will not create setters here. The reason is, that we are going to use constructor injection
    so, there is no point of giving setters
    */
}
