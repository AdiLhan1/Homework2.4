package com.company;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Manufacturer man = new Manufacturer(stock);
        Consumer cons = new Consumer(stock);
        Thread th = new Thread(man);
        Thread th1 = new Thread(cons);
        th.start();
        th1.start();


    }
}
