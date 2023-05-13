package com.infogrupo.registerproducts.application.ports.out;

import com.infogrupo.registerproducts.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
