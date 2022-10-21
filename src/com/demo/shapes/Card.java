package com.demo.shapes;

import java.util.Scanner;

public class Card {
    private Scanner scanner = new Scanner(System.in);
    private String cardBankName;
    private String cardHolder;
    private double value;
    private long cardNumber;

    public Card() {
        System.out.println("Please enter name of Bank: ");
        this.cardBankName = scanner.nextLine();
        System.out.println("Please enter card holder nave: ");
        this.cardHolder = scanner.nextLine();
        System.out.println("Please enter value of card: ");
        this.value = scanner.nextDouble();
        System.out.println("Please enter card number: ");
        this.cardNumber = scanner.nextLong();
    }

    public double getValue() {
        return value;
    }

    public void addValue(double value) {
        this.value += value;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void subtracting(double value) {
        this.value -= value;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getCardBankName() {
        return cardBankName;
    }

    public void setCardBankName(String cardBankName) {
        this.cardBankName = cardBankName;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "BankName='" + cardBankName + '\'' +
                ", value=" + value +
                ", cardNumber=" + cardNumber +
                '}';
    }
}
