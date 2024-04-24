package org.example.springWithAnnotationWithBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private String name;
    @Autowired
    private Samosa samosa;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", samosa=" + samosa +
                '}';
    }
}
