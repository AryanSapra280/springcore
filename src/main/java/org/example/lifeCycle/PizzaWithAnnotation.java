package org.example.lifeCycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PizzaWithAnnotation  {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "PizzaWithAnnotation{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Init() called");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroy() called");
    }
}
