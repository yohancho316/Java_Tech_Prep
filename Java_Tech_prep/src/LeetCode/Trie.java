package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    // Member Attributes
    TrieNode root;

    // Default Constructor
    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = this.root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode next = current.getNode(c);
            if(next == null) {
                current = current.setNode(c);
            } else {
                current = next;
            }
        }
        current.setStatus(true);
    }

    public boolean search(String word) {
        TrieNode current = this.root;
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            TrieNode next = current.getNode(c);
            if(next == null) return false;
            current = next;
        }
        return current.getStatus();
    }

    public boolean startsWith(String prefix) {
        TrieNode current = this.root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            TrieNode next = current.getNode(c);
            if(next == null) return false;
            current = next;
        }
        return true;
    }

    public class TrieNode {

        // Member Attributes
        Map<Character,TrieNode> map;
        boolean isComplete;

        // Default Constructor
        public TrieNode() {
            this.map = new HashMap<Character,TrieNode>();
            this.isComplete = false;
        }

        // Set Node
        public TrieNode setNode(char c) {
            TrieNode temp = new TrieNode();
            this.map.put(c, temp);
            return temp;
        }

        // Set Complete Status
        public void setStatus(boolean status) {
            this.isComplete = status;
        }

        // Get Node
        public TrieNode getNode(char c) {
            return this.map.get(c);
        }

        // Get Complete Status
        public boolean getStatus() {
            return this.isComplete;
        }

    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hi");
        System.out.println("Word Exists: " + trie.search("hi"));
        System.out.println("Prefix Exists: " + trie.startsWith("hil"));
    }
}
