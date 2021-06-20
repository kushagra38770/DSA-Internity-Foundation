//find the length of linked list
//Reverse a linked list
//delete a specific node from a given linked list.
//Insert a specific node from a given linked list.
public class LinkedList {
    Node head;
    public static class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }
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

    int length(){
        int len = 0;
        Node temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        return len;
    }

    public void reverse(){
        Node prev, curr, next;
        prev = null;
        curr = next = head;
        while(next!=null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteBeg(){
        head = head.next;
    }

    public void deleteEnd(){
        Node temp = head, prev=null;
        while(temp!=null){
            prev = temp;
            temp = temp.next;
        }
        if(temp==head){
            head=null;
        }
        else{
            prev.next = null;
        }
    }

    public void deleteAtPosition(int index){
        Node temp = head, prev=null;
        for(int i=0; i<index; i++){
            prev = temp;
            temp = temp.next;
        }
        if(temp==head){
            head=null;
        }
        else{
            prev.next = temp.next;
        }
    }
    static Node InsertPos(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

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
    static Node GetNode(int data) {
        return new Node(data);
    }
    public void show(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
        //System.out.println(node.data);
    }
}
