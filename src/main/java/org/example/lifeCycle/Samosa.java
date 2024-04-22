package org.example.lifeCycle;

public class Samosa {
    private Integer price;

    public Samosa() {
        super();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public void init() {
        System.out.println("I am inside init()");
    }
    public void destroy() {
        System.out.println("I am inside destroy()");
    }
    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
}
