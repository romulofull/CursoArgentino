package com.clientes.customers.entities;
import lombok.*;

import java.util.Objects;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode @ToString
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String address;

}





