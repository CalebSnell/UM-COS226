public class binarySearchTreeNode<T> {

    private T element;
    private binarySearchTreeNode<T> left;
    private binarySearchTreeNode<T> right;

    binarySearchTreeNode() {
        element = null;
        left = null;
        right = null;
    }

    public binarySearchTreeNode(T element, binarySearchTreeNode<T> left, binarySearchTreeNode<T> right){
        this.element = element;
        this.left = left;
        this.right = right;
    }


    //----getters----//
    T getElement() {
        return element;
    }
    private binarySearchTreeNode<T> getLeft() {
        return left;
    }
    private binarySearchTreeNode<T> getRight() {
        return right;
    }
    public int getSize(){
        if (this.isLeaf()) {
            return 1;
        } else if (this.getLeft() != null && this.getRight() == null) {
            return this.getLeft().getSize() + 1;
        } else if (this.getLeft() == null && this.getRight() != null) {
            return this.getRight().getSize() + 1;
        } else {
            return this.getLeft().getSize() + 1 + this.getRight().getSize();
        }
    }
    private boolean isLeaf() {
        return this.getLeft() == null && this.getRight() == null;
    }
    public int getHeight() {
        if (this.isLeaf()) {
            return 0;
        } else if (this.getLeft() != null && this.getRight() == null) {
            return this.getLeft().getHeight() + 1;
        } else if (this.getLeft() == null && this.getRight() != null) {
            return this.getRight().getHeight() + 1;
        } else {
            return Math.max(this.getLeft().getHeight(), this.getRight().getHeight()) + 1;
        }
    }

    //----setters----//
    void setElement(T element) {
        this.element = element;
    }
    void setLeft(binarySearchTreeNode<T> left) {
        this.left = left;
    }
    void setRight(binarySearchTreeNode<T> right){
        this.right = right;
    }

    //----misc----//
    void printPreorder(binarySearchTreeNode<T> node) {
        //PRE: TreeNode object of generic type
        //POST: Prints element of each tree node in postorder
        // Drop out of recursion when we hit a leaf node
        if (node == null) {
            return;
        }
        // Print element only if contains valid data
        if (node.getElement() != null) {
            System.out.println(node.getElement());
        }
        // Recurse through tree
        printPreorder(node.getLeft());
        printPreorder(node.getRight());
    }
    void printPostorder(binarySearchTreeNode<T> node) {
        //PRE: TreeNode object of generic type
        //POST: Prints element of each tree node in postorder
        // Drop out of recursion when we hit a leaf node
        if (node == null) {
            return;
        }
        // Recurse through tree
        printPostorder(node.getLeft());
        printPostorder(node.getRight());
        // Print element only if contains valid data
        if (node.getElement() != null) {
            System.out.println(node.getElement());
        }
    }
}
