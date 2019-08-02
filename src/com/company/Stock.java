package com.company;

public class Stock extends Thread {
    private int stock = 0;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void put() {

        if (stock > 0) {
            try {
                sleep(1000);
            } catch (InterruptedException r) {
                r.printStackTrace();
            }
        }
        stock = stock + 5;
        System.out.println("Производитель положил 5 продуктов ");
        System.out.println("На складе " + stock + " продуктов");
    }

    public void get() {
        if (stock < 0) {
            try {
                sleep(1000);
            } catch (InterruptedException r) {
                r.printStackTrace();
            }
        }
        stock = stock - 5;
        System.out.println("Потребитель взял 5 продуктов ");
        System.out.println("На складе " + stock + " продуктов");
    }


}


