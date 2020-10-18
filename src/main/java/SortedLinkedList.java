public class SortedLinkedList<T extends Comparable<T>> {

    private class Node<T extends Comparable<T>>
    {
        public T data;
        public Node<T> next;

        public Node( T i) {
            data = i;
            next = null;
        }
    }
    public Node<T> head;
    public Node<T> temp;


    protected SortedLinkedList() {
        head = null;
        temp = null;
    }
    public void add(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } 
        else if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
        } 
        else{
            Node<T> curr = head.next;
            Node<T> prev = head;
            while (curr != null) {
                if (data.compareTo(curr.data) < 0) {
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
    }

    public void display()
    {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        SortedLinkedList list=new SortedLinkedList();
        list.add(30);
        list.add(20);
        list.add(70);
        list.add(50);
        list.display();
    }


}
