package com.class2;

public class Wallet {
    int ammount;

    public Wallet() {
        this.ammount = 0;
    }

    public boolean payMoney(int money) {
        if(money > this.ammount)
            return false;

        this.ammount -= money;
        System.out.println("Ammout " + this.ammount);

        return true;
    }

    public void depositMoney(int money) {
        this.ammount += money;
    }
}