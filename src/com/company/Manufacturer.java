package com.company;

public class Manufacturer extends Thread{
    Stock stock;

    public Manufacturer(Stock stock) {
        this.stock = stock;
    }
public void run(){
        stock.put();
}
}
