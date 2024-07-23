package com.clientes.customers.entities;
import java.util.Objects;
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String address;


    public Customer () {

    }
    public Customer(String firstname, String address, String email, String lastname) {
        this.firstname = firstname;
        this.address = address;
        this.email = email;
        this.lastname = lastname;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstname, customer.firstname) && Objects.equals(lastname, customer.lastname) && Objects.equals(email, customer.email) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname=" + firstname +
                ", lastname=" + lastname +
                ", email=" + email +
                ", address=" + address +
                '}';
    }
}





