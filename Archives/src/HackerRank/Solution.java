import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int val;
    Node(int t)
    {
        this.val=t;
    }
}


public class Solution {
    static final int COUNT = 10;
    static   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args)throws IOException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String in[] = br.readLine().split(" ");
            int k=1;
            int arr[]=new int[n+1];
            Node root=null;

            for(String i : in){
                arr[k++]=Integer.parseInt(i);

            }
            //root = insert(root,arr);
            //System.out.println(root.val);
            //print2D(root);
            boolean flag = true;
            Stack<Integer> st = new Stack<>();
            List<Integer> a = new ArrayList<>();
            int cur = 1;
            int len = arr.length;
            while (cur<len || !st.isEmpty()){
                while (cur<len){
                    st.push(cur);
                    cur = 2*cur;
                }
                cur = st.pop();
                a.add(arr[cur]);
                cur = 2*cur + 1;
            }
            for (int i = 1; i <a.size() ; i++) {
                if(a.get(i)<a.get(i-1))
                    flag = false;
            }
            if(flag)
                bw.write("True\n");
            else
                bw.write("False\n");
            bw.flush();

        }
    }//main end
    // static Node insert(Node root,int a){//insert in bst
    //     if(root==null)
    //         return new Node(a);
    //     if(root.val>a)
    //         root.left = insert(root.left,a);
    //     else
    //         root.right = insert(root.right,a);
    //     return root;
    // }
    static void print2DUtil(Node root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
    static Node insert(Node root,int[] a){//insert in cbt
        int l = a.length;
        if(l<=1)
            return root;
        root = new Node(a[1]);

        if(l<=1)
            return root;
        Node[] b = new Node[l];
        b[1]=root;
        if(l>=2){
            root.left = new Node(a[2]);
            b[2]=root.left;
        }
        if(l>=3){
            root.right = new Node(a[3]);




            b[3] = root.right;
        }

        for(int i=1;i<l;i++){
            Node t  = b[i];
            if(2*(i)<l){
                t.left = new Node(a[2*i]);
                b[2*i]= t.left;
            }
            if(2*(i)+1<l){
                t.right = new Node(a[2*i+1]);
                b[2*i+1]= t.right;
            }
        }

        return root;
    }
    static int height(Node root){//height
        if(root==null)
            return -1;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    // static boolean isbst(Node root){
    //     if(root==null)
    //         return true;
    //     if(root.left!=null && root.left.val>root.val)
    //         return false;
    //     if(root.right!=null && root.right.val<root.val)
    //         return false;
    //     return isbst(root.left) && isbst(root.right);
    // }
    static boolean isbst(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    static boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.val < min || node.val > max)
            return false;
 
        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.val-1) &&
                isBSTUtil(node.right, node.val+1, max));
    }





    static boolean iscbt(Node root){
        Queue<Node> q1  = new ArrayDeque();
        Queue<Node> q2  = new ArrayDeque();
        q1.offer(root);
        int l=1;
        int flag =0;
        while(!q1.isEmpty()){
            Node t  = q1.poll();
            if(flag==1 && t.left!=null )
                return false;
            if(t.left!=null)
                q2.offer(t.left);
            else
                flag =1;

            if(flag==1 && t.right!=null )
                return false;

            if(t.right!=null)
                q2.offer(t.right);
            else
                flag =1;

            if(q1.isEmpty()){


                while(!q2.isEmpty()){
                    q1.offer(q2.poll());

                }
                l++;
            }
        }
        return true;



    }



}