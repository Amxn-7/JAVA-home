package LinkedList;
public class newabhi{
    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    Node head;
    public newabhi(int d){
        head = new Node(d);
    }

} 
