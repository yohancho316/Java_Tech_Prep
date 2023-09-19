package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC_559_1 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {
        if(root == null) return 0;

        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);

        int size = 1;
        int depth = 0;

        while(!queue.isEmpty()) {

            Node node = queue.poll();
            --size;

            for(int i = 0; i < node.children.size(); ++i) {
                queue.offer(node.children.get(i));
            }

            if(size == 0) {
                size = queue.size();
                ++depth;
            }
        }

        return depth;
    }
}
