package modelL2;

public class LowHighBST {
    /*.Given the root of a binary search tree and the lowest and highest boundaries as low and
high, trim the tree so that all its elements lie in [low, high]. Trimming the tree should not
change the relative structure of the elements that will remain in the tree (i.e., any node's
descendant should remain a descendant). It can be proven that there is a unique answer.
Return the root of the trimmed binary search tree. Note that the root may change
depending on the given bounds.
Example 1:
Input: root = [1,0,2], low = 1, high = 2
Output: [1,null,2]
Example 2:
Input: root = [3,0,4,null,2,null,null,1], low = 1, high = 3
Output: [3,2,null,1]
Example 3:
Input: root = [1], low = 1, high = 2
Output: [1]
Example 4:
Input: root = [1,null,2], low = 1, high = 3
Output: [1,null,2]
Example 5:
Input: root = [1,null,2], low = 2, high = 4
Output: [2].*/
    class Node{
        int root;
        Node left,right;
        Node(int key){
            root= key;
            left=right= null;
        }
    }
    Node root = null;
    public static void tarvel(int[] arr, int root, int left, int right){

    }
}
