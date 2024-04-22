package org.example;

public class Student {
    private Integer id;
    private String name;
    private String studentaAddress;

    public Student() {
        ;
    }

    public Student(Integer id, String name, String studentaAddress) {
        this.id = id;
        this.name = name;
        this.studentaAddress = studentaAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentaAddress() {
        return studentaAddress;
    }

    public void setStudentaAddress(String studentaAddress) {
        this.studentaAddress = studentaAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentaAddress='" + studentaAddress + '\'' +
                '}';
    }
}
