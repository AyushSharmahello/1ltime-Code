class LinkedList {

    public class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item) {
        Node nn = new Node();
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
            size++;
        } else {
            nn.next = head;
            head = nn;
            size++;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    private Node GetNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("range bade h");
        }
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void addAtIndex(int item, int k) throws Exception {
        if (k == 0) {
            addFirst(item);
        }
        else if (k == size) {
            addLast(item);
        }
        else{
            Node k_1th = GetNode(k - 1);
            Node nn = new Node();
            nn.val = item;
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }

    }

    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);

        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);

        ll.addAtIndex(90, 2);
        ll.display();

    }
}