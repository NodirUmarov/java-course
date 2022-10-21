package com.demo.shapes;

public class Customer extends Person {

    private Wallet wallet; // Homework

    public Customer() {
    }

    public void createWallet() {
        wallet = new Wallet();
    }

    public void addCardToWallet() {
        wallet.addCard();
    }


}


        //wallet.addCard(new Card("Turon Bank", "Nodir Umarov", 5000.0, 9856_8899_5534_5464L));
