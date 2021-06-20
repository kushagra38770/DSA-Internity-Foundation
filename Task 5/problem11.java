//delete a node whose pointer to that node is given only.
public class givenPointerDelete {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void insert(int data){
        Node node = new Node(data);
        //node.data =data;
        //node.next =null;
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

    void deleteNode(Node node){
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
    }

    void printList(Node node){
        while(node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        givenPointerDelete ll = new givenPointerDelete();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.deleteNode(head);
        ll.printList(head);
    }
}
