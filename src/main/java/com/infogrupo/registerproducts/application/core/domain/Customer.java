package com.infogrupo.registerproducts.application.core.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Customer {

    private String id;

    private String name;

    private Address address;

    private String cpf;

    private Boolean isValid;

    public Customer() {
        this.isValid = false;
    }
}
