/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class AllPossibleFullBinaryTrees {
    class TreeNode_last{
        
    }
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> answer= new ArrayList<TreeNode>();
        
        TreeNode root = new TreeNode(0);
        TreeNode tmp = root;
        Stack<Integer> st_cnt= new Stack<Integer>();
        Stack<TreeNode> last_node = new Stack<TreeNode>();
        last_node.add(root);
        st_cnt.add(1);

        int cnt=1,root_cnt=1;
        
        while(!last_node.isEmpty()){
            tmp= last_node.pop();
            cnt= st_cnt.pop().intValue();
            System.out.println(cnt);
            if(cnt>N) continue;
            tmp.left=new TreeNode(0);
            tmp.right=new TreeNode(0);
            if(cnt+2==N) {
                answer.add(root);
                if(root_cnt>=N) return answer;
                root=new TreeNode(0);
                last_node.add(root);
                st_cnt.add(1);
                root_cnt++;
                continue;
            }            
            TreeNode newRoot= copyTree(root);
            
            last_node.add(tmp.left);
            st_cnt.add(cnt+2);
            
            last_node.add(tmp.right);
            st_cnt.add(cnt+2);
            
            
        }
        
        public 
        
        return answer;
    }
}