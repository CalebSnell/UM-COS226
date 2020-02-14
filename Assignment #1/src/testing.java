public class testing {

    public static void main(String[] args) {

        binarySearchTreeNode<String> tree_1  = new binarySearchTreeNode<>();
        tree_1.setElement("one");
        binarySearchTreeNode<String> tree_2 = new binarySearchTreeNode<>();
        tree_2.setElement("two");
        binarySearchTreeNode<String> tree_3 = new binarySearchTreeNode<>();
        tree_3.setElement("three");
        binarySearchTreeNode<String> tree_4 = new binarySearchTreeNode<>();
        tree_4.setElement("four");

        tree_1.setRight(tree_2);
        tree_1.setLeft(tree_3);
        tree_3.setLeft(tree_4);

        System.out.println(tree_1.getElement());
        System.out.println(tree_3.getElement());
        System.out.println(tree_4.getElement());
        System.out.println(tree_2.getElement());

        System.out.println(tree_1.getSize());

        System.out.println("Hello world");








    }
}
