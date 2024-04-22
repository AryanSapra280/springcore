package org.example;

public class Student {
    private Integer id;
    private String name;
    private String studentAddress;

    public Student() {
        ;
    }

    public Student(Integer id, String name, String studentAddress) {
        this.id = id;
        this.name = name;
        this.studentAddress = studentAddress;
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

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
