package Data_Structure_Implementation;


public class BinarySearchTree {

    /*
        - In a BST, all the nodes in the left subtree have values that are less than the value of the root node
          Similarly, all the nodes on the right subtree of the BST have values that are greater than the value of the root node.

        - The BST data structure is more efficient (arrays / linked lists) when it comes to insertion / deletion / searching

        - BST takes O(LOG N) time complexity to search for an element. As elements are ordered, half the subtree is
          discarded at every step while searching for an element. This applies to insertion and deletion.
          O(LOG N) is more efficient than O(N).

        - BST has three main operations (insert / delete / search)

        - Insert an Element in the BST
          An element is always inserted as a leaf node in a BST. Nodes cannot contain duplicate values!
          Step 1: Start from the root
          Step 2: Compare the element to be inserted with the root node. If it is less in value than the root, then
                  traverse the left subtree otherwise traverse the right subtree.
          Step 3: Traverse the subtree till the end of the correct subtree. Insert the node in the appropriate subtree
                  as a leaf node.

        - Search Operation in BST
          To search if an element is present in the BST, we start from the root and traverse to the left or right subtree
          depending on whether the element being searched for is less than or greater than the root.
          Step 1: Compare the elements to be searched with the root node
          Step 2: If the key == root's key, return the root node
          Step 3: Else if key < root, traverse the left subtree
          Step 4: Otherwise traverse the right subtree
          Step 5: Repetitively compare subtree elements until the key is found or the end of the tree is reached.

       - Remove Element from the BST
         When we delete a node from the BST, then there are three possibilities:
         Case 1: The deleted node is a leaf node
         Case 2: The deleted node has only one child node
         Case 3: The deleted node has two child nodes

       - Removing a Leaf Node
         If a node to be deleted is a leaf node, then we can directly delete this node as it has no child nodes.

       - Removing a Node with a Single Child
         When we need to delete the node that has one child, then we reassign it's child reference in the parent node
         and then delete the child.

       - Removing a Node with Two Children
         If the node to be deleted has two children, it becomes a little tricky. We need to find the node which has the
         smallest value in the right subtree (among the elements that have a greater value than the node to be deleted)
         for the node and use that to replace the deleted node. (Note that the smallest value in the right subtree is
         the node that comes immediately after the node to be deleted, implying that it is the inorder successor for the
         node to be deleted). Then delete the duplicate node from the right-subtree.

         Delete w/ Min Child in Right Subtree
         Step 1: Find the min in the right-subtree
         Step 2: Copy the value in the targeted node
         Step 3: Delete the duplicate right-subtree

         Delete w/ Max Child in Left Subtree
         Step 1: Find the max in the left-subtree
         Step 2: Copy the value in the targeted node
         Step 3: Delete duplicate from left-subtree
     */

    public class Node {
        // Node Member Attributes
        public int data;
        public Node left;
        public Node right;

        // Overloaded Constructor
        public Node(int _data) {
            this.data = _data;
            this.left = null;
            this.right = null;
        }
    }

    // BST Member Attributes
    public Node root;

    // Default Constructor
    public BinarySearchTree() {
        this.root = null;
    }

    // Insert Method
    public void insert(int _data) {
        this.root = insert(this.root, _data);
    }

    public Node insert(Node root, int _data) {

        // Base Case
        if(root == null) {
            root = new Node(_data);
            return root;
        }
        // If Root isn't Null & Root.data >
        else if(root.data >= _data) {
            root.left = insert(root.left, _data);
        } else if(root.data < _data) {
            root.right = insert(root.right, _data);
        }
        return root;
    }

    public static void main(String[] args) {

    }
}
