public class App {
    public static void main(String[] args) throws Exception {
        MyBinaryTree myBT = new MyBinaryTree();
        myBT.init();

        MyBinarySearchTree myBST = new MyBinarySearchTree();
        myBST.mRoot = myBST.insert(myBST.mRoot,5);
        myBST.mRoot = myBST.insert(myBST.mRoot,1);
        myBST.mRoot = myBST.insert(myBST.mRoot,6);

        myBST.deleteNode(myBST.mRoot,1);
    }
}
