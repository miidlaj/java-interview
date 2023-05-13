package linkedlist;

public class LinkedList {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }


    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (this.head == null)
            this.head = newNode;
        else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void reverseLinkedList() {
        this.head = reverseLinkedListUtil(this.head, null);
    }

    private Node reverseLinkedListUtil(Node currentNode, Node prevNode) {
        if (currentNode == null)
            return prevNode;

        Node nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseLinkedListUtil(nextNode, currentNode);
    }


    public void printLinkedList() {
        Node currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(8);
        list.addNode(7);
        list.addNode(11);

        list.printLinkedList();

        list.reverseLinkedList();

        list.printLinkedList();

        list.reverseLinkedList();

        list.printLinkedList();

    }
}
