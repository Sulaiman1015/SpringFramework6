package com.sm.bean;

public class Order {
    private String product;
    private int price;

    public Order() {
    }

    public Order(String product, int price) {
        this.product = product;
        this.price = price;
    }

    /**
     * 获取
     * @return product
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置
     * @param product
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Order{product = " + product + ", price = " + price + "}";
    }
}
