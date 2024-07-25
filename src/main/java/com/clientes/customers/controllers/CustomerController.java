package com.clientes.customers.controllers;

import com.clientes.customers.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private List<Customer> list = new ArrayList<>();
    public CustomerController() {

        Customer c = new Customer();
        c.setId(1);
        c.setFirstname("Romulin");
        c.setLastname("Castro");
        c.setEmail("programador@programador");
        c.setAddress("Programador");
        list.add(c);

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setFirstname("Laura");
        c2.setLastname("Castro");
        c2.setEmail("programadora@programador");
        c2.setAddress("Programadora");
        list.add(c2);
    }

        @GetMapping("/customer/107")  // Traer un cliente especifico
        public Customer getCustomer () {
        return null;
        }

        @GetMapping("/customer")  // Traer todos los clientes
        public List<Customer> getallCustomers () {
            return list;
        }
    }
    /*
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





