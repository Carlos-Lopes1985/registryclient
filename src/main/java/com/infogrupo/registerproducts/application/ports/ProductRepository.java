package com.infogrupo.registerproducts.application.ports;

import com.infogrupo.registerproducts.adapters.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProducts();

    Product getProductById(Integer id);

    Product addProduct(Product product);

    Product removeProduct(Integer id);

}
