package darshita.project.grokking_dsa;

public class pathOfSequence {
    public static boolean path(TreeNode root,int[] seq){
        if(root==null){
            return false;
        }
        return pathExistsRec(root,seq,0);
    }

    public static boolean pathExistsRec(TreeNode currentNode, int[] seq, int seqIndex) {
        if(currentNode==null){
            return false;
        }
        if(seqIndex>=seq.length || seq[seqIndex]!= currentNode.value){
            return false;
        }
        if(currentNode.left==null && currentNode.right==null && seqIndex==seq.length-1){
            return true;
        }
        return pathExistsRec(currentNode.left,seq,seqIndex+1) || pathExistsRec(currentNode.right,seq,seqIndex+1);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int[] seq = {1,2,3};
        System.out.println(path(root,seq));
    }
}
