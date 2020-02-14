public class testing {

    public static void main(String[] args) {

        treeNode<String> tree_1  = new treeNode<>();
        tree_1.setElement("one");
        treeNode<String> tree_2 = new treeNode<>();
        tree_2.setElement("two");
        treeNode<String> tree_3 = new treeNode<>();
        tree_3.setElement("three");
        treeNode<String> tree_4 = new treeNode<>();
        tree_4.setElement("four");

        tree_1.setRight(tree_2);
        tree_1.setLeft(tree_3);
        tree_3.setLeft(tree_4);

        System.out.println(tree_1.getElement());
        System.out.println(tree_3.getElement());
        System.out.println(tree_4.getElement());
        System.out.println(tree_2.getElement());

        System.out.println("Hello world");








    }
}
