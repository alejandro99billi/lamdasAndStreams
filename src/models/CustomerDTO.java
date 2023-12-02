package models;

public class CustomerDTO {
    //Data Transfer Object. It is a design pattern used to transfer data between software application subsystems or layers. DTOs are often used in the context of developing enterprise applications to transfer data between a client and a server or between different layers of an application.
    private String customerName;
    private String customerLastName;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerName='" + customerName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                '}';
    }
}
