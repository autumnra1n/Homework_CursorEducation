package com.cursor.hw4.task2.products;

import com.cursor.hw4.task2.abstracts.Product;

public class FoodProduct extends Product {
    private int time;
    double price;

    public FoodProduct(double price, int time){
        this.time = time;
        this.price = price;

    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return null;
    }
}
