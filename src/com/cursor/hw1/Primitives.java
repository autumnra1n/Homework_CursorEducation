package com.cursor.hw1;

public class Primitives {
    public static void main(String[] args) {

        byte b = 100;
        short s = 10_000;
        long l = 1_000_000_000L;
        double d = 127.34d;
        float f = 12.34f;
        char var = (char) (b * s);

        System.out.println((b + s) + "\n" + (s - l) + "\n" + (l * d) + "\n" + (d / f));
        System.out.println(var); // in console - 䉀
    }
}