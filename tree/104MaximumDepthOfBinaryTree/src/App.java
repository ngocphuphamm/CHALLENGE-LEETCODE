public class App {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int chieuCaoBenTraiNode = maxDepth(root.left);
        int chieuCaoBenPhaiNode = maxDepth(root.right);
        int result = Math.max(chieuCaoBenTraiNode, chieuCaoBenPhaiNode);
        return result;
    }
    public static void main(String[] args) throws Exception {
        
    }
}
