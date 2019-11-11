package practice;

import java.util.Scanner;

public class StackImplLinkedList {
    private static Node r=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StackImplLinkedList sl=new StackImplLinkedList();

        while (true) {
            System.out.println("1.PUSH 2.POP 3.PEEK or any key to Exit");
            int c=sc.nextInt();

            switch (c){
                case 1:
                    System.out.println("Enter The Value to be inserted");
                    int n=sc.nextInt();
                    Node b=new Node(n);
                    push(b, r);
                    display(r);break;
                case 2:
                    System.out.println("The Popped item is "+ pop(r));
                    display(r);break;
                case 3:
                    System.out.println("The item at the top is "+ peek(r));break;
                default:System.exit(0);
            }
        }
    }
    private static void display(Node root){
        if (root==null){
            System.out.println("Stack is empty noting Display");
        }
        else {
            System.out.println("State of the stack is : ");
            while(root.next!=null){
                System.out.println(root.value);
                root=root.next;
            }
            System.out.println(root.value);
        }
    }
    private static int peek(Node root){
        if (root==null){
            System.out.println("Stack is empty noting to pop");
            return -1;
        }
        else{
            Node n=root;
            while(n.next!=null){
                n=n.next;
            }
            return n.value;
        }
    }
    private static int pop(Node root){
        if (root==null){
            System.out.println("Stack is empty noting to pop");
            return -1;
        }
        else{
            Node n=root;
            while(n.next.next!=null){
                n=n.next;
            }
            int x=n.next.value;
            n.next=null;
            return x;
        }
    }
    private static void push(Node newNode, Node root){
        if (root==null){
            r=newNode;
        }
        else{
            Node n=root;
            while(n.next!=null){
                n=n.next;
            }
            n.next=newNode;
            System.out.println(newNode.value+" is inserted at the end");
        }
    }
}
class Node{
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}