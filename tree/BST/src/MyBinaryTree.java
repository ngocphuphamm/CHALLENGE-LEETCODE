public class MyBinaryTree {
    private TreeNode root;

    public MyBinaryTree() {

    }

    public void init(){
        TreeNode n0 =  new TreeNode(0);
        TreeNode n1 =  new TreeNode(1);
        TreeNode n2 =  new TreeNode(3);
        TreeNode n3 =  new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        n0.left = n1 ; n0.right = n2 ;
        n1.left = n3 ;n1.right = n4; 

        root = n0;
    }


    
}
