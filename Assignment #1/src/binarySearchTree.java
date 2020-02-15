public class binarySearchTree<T> extends binarySearchTreeNode<T>{

    // the "tree"
    private binarySearchTreeNode<T> root;

    //----constructors----//
    // default null tree
    public binarySearchTree(){
        root = null;
    }
    // create default tree with provided root
    public binarySearchTree(binarySearchTreeNode<T> root) {
        this.root = root;
    }


    //----getters----//
    public binarySearchTreeNode<T> getRoot() {
        return root;
    }
    public int getHeight() {
        return root.getHeight();
    }
    public int getNodeHeight (binarySearchTreeNode<T> node) {
        return node.getHeight();
    }

    public int getSize() {
        return root.getSize();
    }

    //----setters----//
    public void setRoot(binarySearchTreeNode<T> root) {
        this.root = root;
    }


    //----misc----//
    public void postorder() {
        printPostorder(root);
    }
    public void preorder() {
        printPreorder(root);
    }

}
