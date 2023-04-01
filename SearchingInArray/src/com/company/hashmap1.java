package com.company;

import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numHands = Integer.parseInt(sc.nextLine());
        int cardsPerHand = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(numHands);
        a2.add(cardsPerHand);
        if (a2.size() < 2) {
            System.out.println("Usage: Deal hands cards");
            return;
        }


        // Make a normal 52-card deck.
        String[] suit = new String[] {
                "spades", "hearts",
                "diamonds", "clubs"
        };
        String[] rank = new String[] {
                "ace", "2", "3", "4",
                "5", "6", "7", "8", "9", "10",
                "jack", "queen", "king"
        };

        List<String> deck = new ArrayList<String>();
        for (int i = 0; i < suit.length; i++)
            for (int j = 0; j < rank.length; j++)
                deck.add(rank[j] + " of " + suit[i]);

        // Shuffle the deck.
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Not enough cards.");
            return;
        }

        for (int i = 0; i < numHands; i++)
            System.out.println(dealHand(deck, cardsPerHand));
    }

    public static <E> List<E> dealHand(List<E> deck, int n) {
        int deckSize = deck.size();
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }
}