package com.bridgelabz.workshop.deckofcards;

public class DeckOfCardsMain {
    public static void main(String[] args) {
        /*
        In this I have created an object of DeckOfCardsGame class and just calling the method through object.
         */
        DeckOfCardsGame deckOfCardsGame = new DeckOfCardsGame();
        deckOfCardsGame.welcome();
        deckOfCardsGame.deckOfCards();
        deckOfCardsGame.noOfPlayers();
    }
}