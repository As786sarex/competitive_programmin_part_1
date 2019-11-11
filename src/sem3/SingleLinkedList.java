package sem3;

import java.util.Scanner;

public class SingleLinkedList {
    Node root = null;

    public SingleLinkedList(Node root) {
        this.root = root;
    }

    Node getRoot() {
        return this.root;
    }

    void traverse(Node start) {
        if (start != null) {
            while (start.next != null) {
                System.out.print(start.value + "-> ");
                start = start.next;
            }
            System.out.print(start.value + "-> null");
        }
    }

    void insertAtFirst(Node node) {
        node.next = root;
        this.root = node;
    }

    void insertNodeAtEnd(int value, Node roott) {
        if (roott != null) {
            while (roott.next != null) {
                roott = roott.next;
            }
            roott.next = new Node(value);
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList(new Node(32));
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1.Insert At End\n2. Insert At First\n3.traverse\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter value");
                    int value = sc.nextInt();
                    list.insertNodeAtEnd(value, list.getRoot());
                    break;
                case 2:
                    System.out.println("Enter value");
                    list.insertAtFirst(new Node(sc.nextInt()));
                    break;
                case 3:
                    list.traverse(list.getRoot());
                    break;
                default:
                    return;

            }

        }

    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
