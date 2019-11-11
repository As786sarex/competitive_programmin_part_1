package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

@SuppressWarnings("Duplicates")
class BSTOp {
    static Node root;

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            /*String[] s = reader.readLine().split(" ");
            if (s[0].equals("i")) {
                System.out.println(insertBST(Integer.parseInt(s[1]), root));
            } else if (s[0].equals("d")) {
                System.out.println(deleteBST(Integer.parseInt(s[1]), root));
            }*/
            for (int i = 0; i < 200000; i++) {
                insertBST(i*197,root);
            }
        }

    }

    static Node inorderSuccessor(Node node) {
        node = node.right;
        if (node.left != null) {
            while (node.left.left != null) {
                node = node.left;
            }
        }
        return node;
    }

    static int insertBST(int num, Node r) {
        Node node = r;
        int last = 0;
        Node n = null;
        int pos = 1;
        while (node != null) {
            if (num < node.val) {
                n = node;
                last = 1;
                node = node.left;
                pos = 2 * pos;
            } else {
                n = node;
                last = 2;
                node = node.right;
                pos = 2 * pos + 1;
            }

        }
        node = new Node(num);
        if (last == 1) {
            n.left = node;
        } else if (last == 2) {
            n.right = node;
        } else {
            root = node;
        }
        return pos;
    }

    static int deleteBST(int num, Node r) {
        Node node = r;
        int last = 0;
        Node n = null;
        int pos = 1;
        while (node.val != num) {
            if (num < node.val) {
                n = node;
                last = 1;
                node = node.left;
                pos = 2 * pos;
            } else {
                n = node;
                last = 2;
                node = node.right;
                pos = 2 * pos + 1;
            }
        }
        if (node.left == null && node.right == null) {
            if (last == 1) {
                n.left = null;
            } else if (last == 2) {
                n.right = null;
            }
        } else if (node.left != null && node.right != null) {
            Node succ = inorderSuccessor(node);
            if (last == 1) {
                n.left.val = succ.left.val;
            } else if (last == 2) {
                n.right.val = succ.left.val;
            } else {
                if (succ.left == null) {
                    succ.left = root.left;
                    root = succ;
                    return pos;
                } else {
                    if (succ.left.right != null) {
                        root.val = succ.left.val;
                        succ.left = succ.left.left;
                    } else {
                        root.val = succ.left.val;
                        succ.left = null;
                    }
                    return pos;
                }
            }
            succ.left = null;

        } else {
            if (node.left != null) {
                if (last == 1) {
                    n.left.val = node.left.val;
                    node.left = null;
                } else if (last == 2) {
                    n.right.val = node.left.val;
                    node.left = null;
                }
            } else {
                if (last == 1) {
                    n.left.val = node.right.val;
                    node.right = null;
                } else if (last == 2) {
                    n.right.val = node.right.val;
                    node.right = null;
                }
            }
        }


        return pos;
    }
}

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

