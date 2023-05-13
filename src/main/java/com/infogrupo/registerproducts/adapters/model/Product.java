package com.infogrupo.registerproducts.adapters.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private Integer productId;
    private String type;
    private String name;

    private BigDecimal preco;

    private Category category;

    public Product() {
        super();
    }

    public Product(Integer productId, String type, String name, Category category) {
        this.productId = productId;
        this.type = type;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }

    public Product(Integer productId, String type, String name) {
        this.productId = productId;
        this.type = type;
        this.name = name;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productId, product.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
