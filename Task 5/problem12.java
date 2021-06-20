//Reverse a linked list in the group of k
import java.util.Scanner;

public class reverseGroupK {
    Node head;
    public void insert(int data){
        Node node = new Node(data);
        node.data =data;
        node.next =null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    static Node reverse(Node head, int k)
    {
        if(head == null)
            return null;
        Node current = head;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            head.next = reverse(next, k);

        return prev;
    }

    public void show(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insert(sc.nextInt());
        list.insert(sc.nextInt());
        list.insert(sc.nextInt());
        list.insert(sc.nextInt());
        list.insert(sc.nextInt());
        list.head = reverse(list.head,3);
        list.show();
    }
}
