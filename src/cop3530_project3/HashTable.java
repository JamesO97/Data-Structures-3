package cop3530_project3;

public class HashTable {

    LinkedList[] list;
    int size;

    public HashTable(int size) {
        this.size = size;
        this.list = new LinkedList[size];
    }

    public int print(int key) {
        int index = hash(key);
        System.out.println("Key: " + key + " Index: " + index);
        return list[index].head.getData();
    }

    public int hash(int key) {
        int index = key % size;
        return index;
    }

    public void setFront(int data) {
        int index = hash(data);
        Node node = new Node(data);
        if(list[index]== null) {
            list[index] = new LinkedList();
            list[index].setFront(node);
        } else {
            list[index].setFront(node);
        }
    }

    public void setEnd(int data) {
        int index = hash(data);
        Node node = new Node(data);
        if(list[index] == null) {
            list[index] = new LinkedList();
            list[index].setEnd(node);
        } else {
            list[index].setEnd(node);
        }
    }

    public void sortAdd(int data) {
        int index = hash(data);
        Node node = new Node(data);
        if(list[index] == null) {
            list[index] = new LinkedList();
            list[index].sortAdd(node);
        } else {
            list[index].sortAdd(node);
        }
    }
}

