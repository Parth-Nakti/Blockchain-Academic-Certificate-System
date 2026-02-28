package model;
import services.HashUtil;

import java.time.LocalDateTime;
import java.util.Objects;

public class Block {

    private int index;
    private String timestamp;
    private String data;  // Certificate data
    private String previousHash;
    private String hash;

    public Block(int index, String data, String previousHash) {
        this.index = index;
        this.timestamp = LocalDateTime.now().toString();
        this.data = data;
        this.previousHash = previousHash;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String input = index + timestamp + data + previousHash;
        return HashUtil.applySHA256(input);
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getData() {
        return data;
    }

    public String toString() {
        return "Block{" +
                "index=" + index +
                ", timestamp='" + timestamp + '\'' +
                ", data='" + data + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", hash='" + hash + '\'' +
                '}';
    }
}