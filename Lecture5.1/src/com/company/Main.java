package com.company;

public class Main {

    public static void main(String[] args) {
        Messenger myPigeon = new Messenger();
        myPigeon.addMessage("Hello");
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {

        }
        myPigeon.addMessage("who is here?");
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {

        }
        myPigeon.showLast();
    }
}
