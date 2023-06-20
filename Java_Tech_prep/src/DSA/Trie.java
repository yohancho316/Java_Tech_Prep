package DSA;

public class Trie {

    // Member Attribute
    private TrieNode root;

    // Constructor Method
    public Trie() {
        this.root = new TrieNode();
    }

    public TrieNode getRoot() {
        return this.root;
    }

    public void setRoot(TrieNode root) {
        this.root = root;
    }

    public void insertWord(String s) {
        TrieNode root = this.root;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode next = root.getChild(c);
            if(next == null) {
                root = root.addChild(c);
            } else {
                root = next;
            }
        }
        root.setCompleteWord(true);
    }

    public boolean search(String s) {
        if(s.isEmpty()) return false;
        TrieNode current = this.root;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode next = current.getChild(c);
            if(next == null) return false;
            current = next;
        }
        return current.getCompleteWord();
    }

    public boolean startsWith(String s) {
        if(s.isEmpty()) return false;
        TrieNode current = this.root;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            TrieNode next = current.getChild(c);
            if(next == null) return false;
            current = next;
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("hello");
        System.out.println("Exists: " + trie.search("hello"));
        System.out.println("Prefix Exists: " + trie.startsWith("h"));
    }
}
