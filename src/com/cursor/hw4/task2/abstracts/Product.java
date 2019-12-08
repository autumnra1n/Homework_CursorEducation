package com.cursor.hw4.task2.abstracts;

import com.cursor.hw4.task2.interfaces.Buyable;

public abstract class Product implements Buyable {
    String name;
    int price;
    int quantity;
    int ageRestriction;
}
