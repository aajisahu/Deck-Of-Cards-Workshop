package com.bridgelabz.workshop.deckofcards;

public class DeckOfCardsMain {
	public static void main(String[] args) {
		/*
		 * printing the welcome message
		 */
		System.out.println("\n*-*-*-* Welcome to Deck Of Cards *-*-*-*");

		/*
		 * created object of the DeckOfCardsGame 
		 */
		DeckOfCards deckOfCardsGame = new DeckOfCards();

		/*
		 * Using Object reference calling the method of DeckOfCards Class
		 */
		deckOfCardsGame.initilizeCards();
	}
}