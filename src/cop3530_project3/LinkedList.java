package cop3530_project3;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void setEnd(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        previousNode.setNext(node);
    }

    public void setFront(Node node) {
        if (head == null) {
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    public void sortAdd(Node node) {
        Node current;
        //Node newNode = new Node(data);
        if (head == null || head.getData() >= node.getData()) {
            node.setNext(head);
            head = node;
        } else {
            current = head;
            while (current.getNext() != null && current.getNext().getData() < node.getData()) {
                current = current.getNext();
            }
            current.setNext(node.getNext());
            current.setNext(node);
        }
    }

    public void showLinkedList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.getData());
            System.out.print(" ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}

