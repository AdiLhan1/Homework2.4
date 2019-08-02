package com.company;

public class Consumer extends Thread {
    Stock stock;

    public Consumer(Stock stock) {
        this.stock = stock;
    }
    public void run(){
        stock.get();
    }
}
