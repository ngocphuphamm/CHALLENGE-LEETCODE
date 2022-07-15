public class MyBinarySearchTree {
    public TreeNode mRoot;

    MyBinarySearchTree()
    {

    }

    public TreeNode insert(TreeNode root , int value)
    {
        TreeNode newNode = new TreeNode(value);
        // TH1 ROOT == NULL
        if(root == null)
        {
            root = newNode;
            return root;
        }
        else{
            TreeNode temp = root;
            while(true)
            {
                if(value > temp.val)
                {
                    if(temp.right == null)
                    {
                        temp.right = newNode;
                        break;
                    }
                    else
                    {
                        temp = temp.right;
                    }
                }
                else 
                {
                    if(temp.left == null)
                    {
                         temp.left = newNode ;
                         break;

                    }
                    else
                    {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }


    public TreeNode insertRecursionBST(TreeNode rootNode , int value)
    {
        if(rootNode == null)
        {
            return new TreeNode(value);
        }
        else
        {
            if(value < rootNode.val)
            {
                if(rootNode.left == null)
                {
                    rootNode.left = new TreeNode(value);
                }
                else
                {
                    insertRecursionBST(rootNode.left,value);

                }
            }
            else{
                if(rootNode.right == null)
                {
                    rootNode.right = new TreeNode(value);
                }
                else
                {
                    insertRecursionBST(rootNode.right,value);

                }
            }
        }
        return rootNode;
    }

}
