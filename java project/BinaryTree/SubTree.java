package BinaryTree;
import java.lang.*;
public class SubTree {
    static class  Node {
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    static class  BinaryT {
        static int idx=-1;
        public Node buildTree(int nodes[]){
            idx++;
          if(nodes[idx]==-1){
            return null;
          }
          Node newNode=new Node(nodes[idx]);
          newNode.left=buildTree(nodes);
          newNode.right=buildTree(nodes);
        return newNode;
        }        
    }
    public static void inorder(Node root){
        if(root==null){
         return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
           return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
          return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
          }
      return true;
    }
    public static boolean isSubtring(Node root,Node subroot){
         if(root==null){
           return false;
         }
         if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
         }
       return isSubtring(root.left, subroot) || isSubtring(root.right, subroot);
    }
    public static void main(String arg[]){
        // int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // int arr1[]={2,4,-1,-1,5,-1,-1};
        // BinaryT tree=new BinaryT();
        // Node root=tree.buildTree(arr);
        // inorder(root);
        // Node subroot=tree1.buildTree(arr1); 
        // inorder(subroot);      

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        inorder(root);

        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        inorder(subroot);

        System.out.println(isSubtring(root, subroot));
    }
}
