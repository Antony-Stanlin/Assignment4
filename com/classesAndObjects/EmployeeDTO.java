package com.ClassesAndObjects;
public class EmployeeDTO {

    //static variable
    private static int employeeCount = 0;

    // Instance variables
    private int id;
    private String name;
    private String position;
    private String department;
    private double salary;

    // PII (Persoally Identifiable Information)
    private String socialSecurityNumber;
    private String phoneNumber;
    private String email;

    //constructor
    public EmployeeDTO(int id, String name, String position, String department, double salary, 
                       String socialSecurityNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        employeeCount++;
    }

    //getter and setter

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getMaskedSocialSecurityNumber() {
        return "XXX-XX-" + socialSecurityNumber.substring(socialSecurityNumber.length() - 4);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMaskedPhoneNumber() {
        return "XXXX XXX "+phoneNumber.substring(7);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString(){

        return """
                %s

                    ID          : %d
                    Name        : %s
                    Position    : %s
                    Department  : %s
                    Salary      : %.2f
                    SSN         : %s
                    Phone Number: %s
                    Email       : %s
                %s
            """.formatted("_".repeat(40),getId(),getName(),getPosition(),getDepartment(),getSalary(),getMaskedSocialSecurityNumber(),getMaskedPhoneNumber(),getEmail(),"_".repeat(40));
    }

}
