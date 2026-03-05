package ui;

import model.Blockchain;
import model.Certificate;

public class Main {

    public static void main(String[] args) {

        Blockchain blockchain = new Blockchain();

        Certificate c1 = new Certificate(
            "CERT101",
            "Rahul",
            "22CS101",
            "BTech",
            85,
            "VIT Pune"
    );
    
    Certificate c2 = new Certificate(
            "CERT102",
            "Priya",
            "22CS102",
            "BTech",
            90,
            "VIT Pune"
    );
    
    blockchain.addBlock(c1);
    blockchain.addBlock(c2);
        blockchain.printBlockchain();

        System.out.println("Is Blockchain Valid? " + blockchain.isChainValid());
    }
}