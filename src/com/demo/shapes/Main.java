package com.demo.shapes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // ClassName variableName = spaceInMemory invokeConstructor(send arguments);

        Address address = new Address();
        address.setId(1L);
        address.setState("Uzbekistan");
        address.setCity("Tashkent");
        address.setDistrict("Mirzo Ulugbek");
        address.setHouse("19A");
        address.setStreet1("Avayhon");
        address.setApartment("50");
        address.setPostalCode("100000");

        Employee employee = new Employee();
        employee.setIdentification(1L);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmail("john@gmail.com");
        employee.setPatronymic("Johns son");
        employee.setPosition("Java Developer");
        employee.setSalary(45000);
        employee.setDob(LocalDate.parse("1980-12-25"));
        employee.setAddress(address);

        Employee employee2 = new Employee();
        employee2.setIdentification(2L);
        employee2.setFirstName("Sarah");
        employee2.setLastName("Doe");
        employee2.setEmail("sarah@gmail.com");
        employee2.setPatronymic("Johns son");
        employee2.setPosition("Java Developer");
        employee2.setSalary(45000);
        employee2.setDob(LocalDate.parse("1981-12-25"));
        employee2.setAddress(address);


    }
}
