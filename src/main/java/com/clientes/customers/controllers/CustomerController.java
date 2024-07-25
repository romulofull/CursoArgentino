package com.clientes.customers.controllers;

import com.clientes.customers.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customer/107")  // Traer un cliente especifico
    public Customer getCustomer() {

        Customer c = new Customer();
        c.setId(107);
        c.setFirstname("Romulin");
        c.setLastname("Castro");
        c.setEmail("programador@programador");
        c.setAddress("Programador");
        return c;
    }

/*
    @GetMapping("/customer")  // Traer todos los clientes
    public List<Customer> getallCustomers() {
        return null;
    }
    @GetMapping("/prueba")  // Agregar cliente
    public void addCustomer(Customer customer) {
    }

    @GetMapping("/prueba")  // Eliminar cliente
    public void removeCustomer {
    }

    @GetMapping("/prueba")  // Modificar cliente
    public void updateCustomer() {
    }

    @GetMapping("/prueba")  // Buscar cliente
    public List<Customer> searchCustomer() {
        return null;
    }*/


    @GetMapping("/prueba5")
    public List<Customer> prueba5() {
        List<Customer> customers = new ArrayList<>();
        Customer c = new Customer();
        c.setFirstname("Romulin");
        c.setLastname("Castro");
        c.setEmail("programador@programador");
        c.setAddress("Programador");
        customers.add(c);

        Customer c2 = new Customer();
        c2.setFirstname("Laura");
        c2.setLastname("Castro");
        c2.setEmail("programadora@programador");
        c2.setAddress("Programadora");
        customers.add(c2);
        return customers;

    }
}

