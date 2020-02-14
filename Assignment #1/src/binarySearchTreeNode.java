public class binarySearchTreeNode<T> {

    private T element;
    private binarySearchTreeNode<T> left;
    private binarySearchTreeNode<T> right;

    public binarySearchTreeNode() {
        element = null;
        left = null;
        right = null;
    }

    public binarySearchTreeNode(T element) {
        this.element = element;
    }


    //----getters----//
    public T getElement() {
        return element;
    }
    public binarySearchTreeNode<T> getLeft() {
        return left;
    }
    public binarySearchTreeNode<T> getRight() {
        return right;
    }
    public int getSize() {
        return size(this);

    }
    public int size(binarySearchTreeNode<T> node){
        // Return 0 if no descendants
        if (node == null) {
            return 0;
        }
        // Recurse through, adding 1 each time
        else {
            return size(node.getLeft()) + 1 + size(node.getRight());
        }
    }
    public int getHeight(binarySearchTreeNode<T> node){
        return 0;
    }

    //----setters----//
    public void setElement(T element) {
        this.element = element;
    }
    public void setLeft(binarySearchTreeNode<T> left) {
        this.left = left;
    }
    public void setRight(binarySearchTreeNode<T> right){
        this.right = right;
    }
}
