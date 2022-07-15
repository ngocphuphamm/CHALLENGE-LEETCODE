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

    // xoa node key trong cay root 
    // return cay moi da duoc xoa node ; 
     
    public TreeNode deleteNode(TreeNode root , int key)
    {
        if(root == null)
        {
            return null;
        }
        // b1 : di tim node xoa 
        if(key < root.val)
        {
            root.left = deleteNode(root.left, key);
            
        }
        else if(key > root.val)
        {
            root.right =deleteNode(root.right, key);
        }
        // b2 : xoa node 
        else // root.val == key => xoa root
        {
            // TH1  ROOT LA NODE LEAF 
            if(root.left == null && root.right == null)
            {
                return null;
            }
            // TH2 : Chi co 1 con ben trai 
            if (root.left != null && root.right == null) 
            {
                return root.left;
            }
            if(root.left == null && root.right != null)
            {
                return root.right;
            }
            // TH3 : TON TAI 2 CON 
            // Tim node trai cung cua cay con ben phai 
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            // xoa phan tu con du sau khi dich chuyen
            root.right = deleteNode(root.right,leftModeNode.val);
        }
        return root;
    }
    // tim node con trai cung
    public TreeNode findLeftModeNode(TreeNode root)
    {
        if(root == null)
        {
            return null;
        }
        else
        {
            TreeNode leftMostNode = root;
            while(leftMostNode.left != null)
            {
                leftMostNode = leftMostNode.left;
            }
            return leftMostNode;
        }
    }

    public TreeNode searchBST(TreeNode root , int key)
    {
        if(root == null)
            return null;
        if(key < root.val)
        {
            return searchBST(root.left,key);
        }
        else if(key > root.val)
        {
            return searchBST(root.right,key);
        }
        else
        {
            return root;
        }

    }

    //NODE - L -R 
    public void PreOder(TreeNode currNode)
    {
        if(currNode == null) return ;
        // Duyet curnode truoc
        System.out.print(currNode.val  + " ");
        // Duyet Ben trai 
        PreOder(currNode.left);
        PreOder(currNode.right);
    }

}
 
