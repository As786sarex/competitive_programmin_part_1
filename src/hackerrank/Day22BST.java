package hackerrank;

import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    static int h=0;
    static int m=0,x=0;

    public static int getHeight(Node root) {
        if (root!=null) {
           while(root.left!=null){
               getHeight(root.left);
               x++;
           }
           while(root.right!=null){
               getHeight(root.right);
               m++;
           }
        }
        if (m>x){
            h=m;
        }
        else
            h=x;

        return h;


    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
