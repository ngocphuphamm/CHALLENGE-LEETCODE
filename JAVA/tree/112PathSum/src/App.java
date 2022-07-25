public class App {
    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
    public boolean Duyet(TreeNode curNode,int curSum , int targetSum) 
    {
        if(curNode == null ) return false;
        curSum += curNode.val;

        if(isLeaf(curNode) == true)
        {
            if(curSum == targetSum) return true;
        }
        boolean kqBenTrai = Duyet(curNode.left,curSum,targetSum);
        boolean kqBenPhai = Duyet(curNode.right,curSum,targetSum);
        
        return kqBenTrai || kqBenPhai;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
     {
        return Duyet(root , 0 , targetSum);   
        
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
