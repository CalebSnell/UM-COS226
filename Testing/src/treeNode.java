public class treeNode<T> {

    private T element;
    private treeNode<T> left;
    private treeNode<T> right;

    public treeNode() {
        element = null;
        left = null;
        right = null;
    }

    public treeNode (T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
    public treeNode<T> getLeft() {
        return left;
    }
    public treeNode<T> getRight() {
        return right;
    }

    public void setElement(T element) {
        this.element = element;
    }
    public void setLeft(treeNode<T> left) {
        this.left = left;
    }
    public void setRight(treeNode<T> right){

    }
}
