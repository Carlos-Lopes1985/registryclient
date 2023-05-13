package com.infogrupo.registerproducts.application.core.usercase;

import com.infogrupo.registerproducts.application.core.domain.Customer;
import com.infogrupo.registerproducts.application.ports.out.FindAddressByZipCodeOutPutPort;
import com.infogrupo.registerproducts.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUserCase {

    private final FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort;

    private  final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUserCase(FindAddressByZipCodeOutPutPort findAddressByZipCodeOutPutPort, InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutPutPort = findAddressByZipCodeOutPutPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var adrress = findAddressByZipCodeOutPutPort.find(zipCode);
        insertCustomerOutputPort.insert(customer);
    }
}
