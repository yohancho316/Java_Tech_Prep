package DSA;

public class TrieNode {

    // Member Attributes
    private static final int MAX_SIZE = 26;
    private TrieNode[] children;
    private boolean completeWord;

    // Constructor Method
    public TrieNode() {
        this.children = new TrieNode[this.MAX_SIZE];
        this.completeWord = false;
    }

    public int getIndex(char c) {
        return Character.toLowerCase(c) - 'a';
    }

    public TrieNode getChild(char c) {
        return this.children[this.getIndex(c)];
    }

    public TrieNode addChild(char c) {
        TrieNode temp_node = new TrieNode();
        this.children[this.getIndex(c)] = temp_node;
        return temp_node;
    }

    public void setCompleteWord(boolean state) {
        this.completeWord = state;
    }

    public boolean getCompleteWord() {
        return this.completeWord;
    }
}
