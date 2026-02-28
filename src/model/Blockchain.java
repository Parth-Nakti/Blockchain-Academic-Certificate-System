package model;

import java.util.ArrayList;

public class Blockchain {

    private ArrayList<Block> chain;

    public Blockchain() {
        chain = new ArrayList<>();
        chain.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        return new Block(0, "Genesis Block", "0");
    }

    public void addBlock(String data) {
        Block previousBlock = chain.get(chain.size() - 1);
        Block newBlock = new Block(chain.size(), data, previousBlock.getHash());
        chain.add(newBlock);
    }

    public void printBlockchain() {
        for (Block block : chain) {
            System.out.println(block);
        }
    }

    public boolean isChainValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block current = chain.get(i);
            Block previous = chain.get(i - 1);

            if (!current.getPreviousHash().equals(previous.getHash())) {
                return false;
            }

            if (!current.getHash().equals(current.calculateHash())) {
                return false;
            }
        }
        return true;
    }
}