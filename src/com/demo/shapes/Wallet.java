package com.demo.shapes;

public class Wallet {

    private Card[] cards = new Card[10];
    private int countOfCards;

    public void addCard() {
        if (countOfCards == 10) {
            System.out.println("There is no more room for cards");
            return;
        }
        Card card = new Card();
        cards[countOfCards++] = card;
    }

    public void printAllCards() {
        for (int i = 0; i < countOfCards; i++) {
            System.out.printf("№-%d number of card %d\n", i + 1, cards[i]);
        }
    }

    public void deleteCard(int cardNumber) {
        for (int i = cardNumber; i < countOfCards; i++) {
            if (countOfCards == 1) {
                countOfCards = 0;
                return;
            }
            cards[i] = cards[i + 1];
        }
        countOfCards--;
    }

    public Card getCards(int numberOfCard) {
        if (numberOfCard <= countOfCards) {
            return cards[numberOfCard];
        }
        return cards[0];
    }
}
