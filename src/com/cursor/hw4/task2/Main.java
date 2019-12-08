package com.cursor.hw4.task2;

import com.cursor.hw4.task2.abstracts.Product;
import com.cursor.hw4.task2.products.FoodProduct;

public class Main {
    public static void main(String[] args) {
        Product [] products = {new FoodProduct(100,33)};

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
