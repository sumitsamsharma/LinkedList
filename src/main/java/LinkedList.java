public class LinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node temp = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            temp = newNode;
        }
        else {
            temp.next = newNode;
            temp = newNode;
        }
    }

    public void addingAtStart(int data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            temp =newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

     static Node GetNode(int data) {
        return new Node(data);
    }

    static Node removeFirstNode(Node head)
    {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return head;
    }

    static Node InsertPos(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("You entered an invalid position");

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);
                    newNode.next = headNode.next;
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }

    public static void display(Node head)
    {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        //System.out.println("Adding nodes at start.....");
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedList insert(LinkedList list, int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while (last.next != null) {
                last = last.next; }
            last.next = new_node;
        }
        return list;
    }

    public static void main(String[] args) {

        Node head = GetNode(56);
        head.next = GetNode(30);
        head.next.next = GetNode(70);

        System.out.print("Linked list before insertion: ");
        display(head);
        head=removeFirstNode(head);
        display(head);

    }
}