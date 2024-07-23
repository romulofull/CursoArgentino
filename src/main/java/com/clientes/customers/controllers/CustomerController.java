package com.clientes.customers.controllers;

import com.clientes.customers.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {
    @GetMapping("/prueba")
    public String prueba() {
        return "Hola Mundo";
    }


    @GetMapping("/prueba2")

    public List<String> prueba2() {
        List<String> list = new ArrayList<>();
        list.add("Lucas");
        list.add("Romulo");
        list.add("Luis");
        return list;
    }


    @GetMapping("/prueba3")

    public Map<String, String> prueba3() {
        Map<String, String> map = new HashMap();
        map.put("nombre", "Romulo");
        map.put("nombre2", "Theo");
        map.put("nombre3", "Luis");
        return map;
    }
    @GetMapping("/prueba4")

    public Customer prueba4() {
        Customer c = new Customer();
        c.setFirstname("Romulin");
        c.setLastname("Castro");
        c.setEmail("programador@programador");
        c.setAddress("Programador");
        return c;
    }

}