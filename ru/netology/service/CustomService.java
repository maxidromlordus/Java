package ru.netology.service;

public class CustomService {
    static final int AMENDA = 100;

    public static int Calculate(double price, int m) {
        double v = (price / 100) + (m * AMENDA);
        return (int) v;
    }
}
