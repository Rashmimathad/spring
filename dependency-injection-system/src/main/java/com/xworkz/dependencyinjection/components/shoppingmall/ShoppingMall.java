package com.xworkz.dependencyinjection.components.shoppingmall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ShoppingMall {

    private int mallId;
    private String mallName;

    @Autowired
    private Shop shop;

    public int getMallId() {
        return mallId;
    }

    public Shop getShop() {
        return shop;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setMallId(int mallId) {
        this.mallId = mallId;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "mallId=" + mallId +
                ", mallName='" + mallName + '\'' +
                ", shop=" + shop +
                '}';
    }
}

