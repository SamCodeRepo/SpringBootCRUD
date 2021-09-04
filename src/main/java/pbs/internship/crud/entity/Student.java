package pbs.internship.crud.entity;

public class Student {

    private int studentId;
    private String name;
    private String address;

    public Student(int student, String name, String address) {

        this.studentId = student;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
