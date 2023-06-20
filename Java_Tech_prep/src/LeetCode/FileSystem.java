package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FileSystem {

    // FileSystem Member Attributes
    private TrieNode root;

    // FileSystem Default Constructor
    public FileSystem() {
        this.root = new TrieNode();
    }

    // createPath Method
    public boolean createPath(String path, int value) {

        // Check Invalid Path
        if(path.isEmpty() || path.equals("/")) return false;

        // Check if Value Already Exists
        boolean alreadyExists = this.get(path) != -1 ? true : false;
        System.out.println("Does Value Already Exist: " + alreadyExists);

        // Return False if Path Exists && Value Exists
        if(alreadyExists) return false;

        // Find the Last Slash Pos in Path
        int slashPos = this.findLastSlash(path);

        // Find the Prefix Substring
        String prefix = path.substring(0, slashPos);

        // Check if Prefix Exists
        boolean prefixExists = this.startsWith(prefix);

        // Multiple Subdirectories && Prefix Doesn't Exist
        if(slashPos > 0 && !prefixExists) return false;

        TrieNode current = this.root;

        if(slashPos == 0 || prefixExists) {
            for(int i = 0; i < path.length(); i++) {
                char c = path.charAt(i);
                current = current.addNode(c);
            }
        }

        current.setValue(value);
        return true;
    }

    // Check if Value Exists
    public int get(String path) {
        TrieNode current = this.root;
        for(int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            TrieNode next = current.map.get(c);
            if(next == null) return -1;
            current = next;
        }
        return current.getValue();
    }

    public int findLastSlash(String path) {
        int pos = -1;
        for(int i = path.length() - 1; i >= 0; i--) {
            char c = path.charAt(i);
            if(Character.compare(c, '/') == 0) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public boolean startsWith(String prefix) {
        TrieNode current = this.root;
        for(int i = 0;i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            TrieNode next = current.map.get(c);
            if(next == null) return false;
            current = next;
        }
        return true;
    }

    public class TrieNode {

        // Member Attributes
        private Map<Character,TrieNode> map;
        private int value;

        // Default Constructor
        public TrieNode() {
            this.map = new HashMap<Character,TrieNode>();
            this.value = -1;
        }

        // Add Node Method
        public TrieNode addNode(char c) {
            TrieNode temp = new TrieNode();
            this.map.put(c, temp);
            return temp;
        }

        // Set Value
        public void setValue(int value) {
            this.value = value;
        }

        // Get Value
        public int getValue() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        FileSystem system = new FileSystem();
        System.out.println("Creating Trie: " + system.createPath("/computer", 5));
        System.out.println("Creating Duplicate Trie: " + system.createPath("/computer", 20));
        System.out.println("Retrieving Value: " + system.get("/computer"));
        System.out.println("Adding Additional Directory: " + system.createPath("/computer/john", 20));
        System.out.println("Retrieving Value: " + system.get("/computer/john"));
        System.out.println("Adding New Directory: " + system.createPath("/abc/def", 100));

    }

}
