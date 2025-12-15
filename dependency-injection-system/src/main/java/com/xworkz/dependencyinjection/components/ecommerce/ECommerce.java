package com.xworkz.dependencyinjection.components.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ECommerce {

    private int id;
    private String name;
    @Autowired
    private Product product;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ECommerce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", product=" + product +
                '}';
    }
}
