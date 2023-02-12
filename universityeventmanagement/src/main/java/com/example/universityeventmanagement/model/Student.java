package com.example.universityeventmanagement.model;

public class Student {
    private int StudentId;
    private String firstname;
    private String lastname;
    private int age;
    private String department;


    public int getStudentId() {
        return StudentId;
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public Student(int studentId, String firstname, String lastname, int age, String department) {
        StudentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [StudentId=" + StudentId + ", firstname=" + firstname + ", lastname=" + lastname + ", age="
                + age + ", department=" + department + "]";
    }


}
