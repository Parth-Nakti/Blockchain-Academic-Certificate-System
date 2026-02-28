package ui;

import model.Blockchain;

public class Main {

    public static void main(String[] args) {

        Blockchain blockchain = new Blockchain();

        blockchain.addBlock("Certificate: Rahul - BTech - 85%");
        blockchain.addBlock("Certificate: Priya - BTech - 90%");

        blockchain.printBlockchain();

        System.out.println("Is Blockchain Valid? " + blockchain.isChainValid());
    }
}