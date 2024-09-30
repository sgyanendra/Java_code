package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeYT {
    static class Node{
          int data;
          Node left;
          Node right;
          Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
          }
    }
    static class BinaryT{
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

    public static void preorder(Node root){
       if(root==null){
          return;
       }
       System.out.println(root.data);
       preorder(root.left);
       preorder(root.right);
    }
    
    public static void inorder(Node root){
        if(root==null){
         return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }

    public static void postorder(Node root){
      if(root==null){
       return;
      }
      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data);
  }

   public static void levelOrder(Node root){
       if(root==null){
         return;
       }
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()){
           Node currNode=q.remove();
           if(currNode==null){
             System.out.println();
              if(q.isEmpty()){
                break;
              }else{
                q.add(null);
              }
           }else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
              q.add(currNode.left);
            }
            if(currNode.right!=null){
              q.add(currNode.right);
            }
           }
       }
   }

   public static int height(Node root){
      if(root==null){
        return 0;
      }
      int lh=height(root.left);
      int rh=height(root.right);

   return Math.max(lh,rh)+1;
  }

   public static int count(Node root){
        if(root==null){
          return  0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
       return lc+rc+1;
      }

    public static int diameter(Node root){
        if(root==null){
           return 0;
        } 
       int lD=diameter(root.left);
       int lh=height(root.left);
       int rD=diameter(root.right);
       int rh=height(root.right);
       int selfD=lh+rh+1;

      return Math.max(selfD,Math.max(lD, rD));
    }
    public static void main(String arg[]){
     int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
     BinaryT tree=new BinaryT();
     Node root=tree.buildTree(arr);
    //  System.out.println(root.data);
    // preorder(root);
    // inorder(root);
    // postorder(root);  
      //  levelOrder(root);
      System.out.println("Total height: "+height(root));
      System.out.println("Total Nodes: "+count(root));
      System.out.println("Diameter: "+diameter(root));

   }
}
