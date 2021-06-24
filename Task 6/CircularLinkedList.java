//Circular Linked List implementation in java
public class CircularLinkedList{
    Node head, temp;
    static class Node {
        int data;
        Node next;
    }
    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head == null){
            head = temp = newNode;
        }
        else{
            temp.next = newNode;
            temp = newNode;
        }
        temp.next = head;
    }

    public void traverse(){
        Node temp = head;
        if(head == null){
            return;
        }
        else{
            while(temp.next!=head){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }
    public static void main(String[] args){
        //System.out.print("Hello world");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(0);
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.traverse();
    }
}
