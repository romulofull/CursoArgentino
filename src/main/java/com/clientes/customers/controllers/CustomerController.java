package com.clientes.customers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("/prueba")
    public String prueba() {
return "Hola Mundo"; }



@GetMapping("/prueba2")

        public List<String> prueba2() {
             List<String> list =  new ArrayList<>();
            list.add ("Lucas");
            list.add ("Romulo");
            list.add ( "Luis");
            return list;
    }
}
