package ui;

import java.util.Scanner;
import model.Blockchain;
import model.Certificate;

public class Main {

    public static void main(String[] args) {

        Blockchain blockchain = new Blockchain();
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("\n====== Blockchain Certificate System ======");
            System.out.println("1. Add Certificate");
            System.out.println("2. View Blockchain");
            System.out.println("3. Verify Blockchain");
            System.out.println("4. Tamper Blockchain (Demo)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Certificate ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Roll Number: ");
                    String roll = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter University: ");
                    String university = scanner.nextLine();

                    Certificate cert = new Certificate(id, name, roll, course, marks, university);

                    blockchain.addBlock(cert);

                    System.out.println("Certificate added to blockchain!");

                    break;

                case 2:

                    blockchain.printBlockchain();

                    break;

                case 3:

                    System.out.println("Is Blockchain Valid? " + blockchain.isChainValid());

                    break;

                case 4:

                    if(blockchain.getChain().size() > 1) {

                        System.out.println("Tampering with Block 1...");

                        blockchain.getChain().get(1).getData().setStudentName("Hacker");

                        System.out.println("Block data modified!");

                    } else {

                        System.out.println("No block available to tamper.");

                    }

                    break;

                case 5:

                    System.out.println("Exiting program...");
                    return;

                default:

                    System.out.println("Invalid choice. Try again.");

            }

        }

    }

}