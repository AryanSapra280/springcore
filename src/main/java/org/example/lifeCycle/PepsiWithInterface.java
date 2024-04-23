package org.example.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class PepsiWithInterface implements InitializingBean, DisposableBean {
    private int price;
    public PepsiWithInterface() {
        super();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PepsiWithInterface{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method is called after initialization of properties");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method is launched");
    }
}
