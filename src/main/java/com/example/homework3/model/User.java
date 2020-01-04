package com.example.homework3.model;

public class User {

    private String name;
    private Address address;
    private Integer age;
    private String phone;

    public User(String name, String address, Integer age, String phone) {
        this.name = name;
        this.address = new Address("USA", "Fayetteville",  "Arkansas" );
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
