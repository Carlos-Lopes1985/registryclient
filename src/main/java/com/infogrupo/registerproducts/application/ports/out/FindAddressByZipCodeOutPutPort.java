package com.infogrupo.registerproducts.application.ports.out;

import com.infogrupo.registerproducts.application.core.domain.Address;

public interface FindAddressByZipCodeOutPutPort {

    Address find(String zipCode);

}
