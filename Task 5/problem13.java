// given a linked list arrange it in the below fashion 
// L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 
public class arrange{
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
  
static Node reverselist(Node node)
    {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
 
    void rearrange(Node node)
    {

        Node slow = node, fast = slow.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;
 
        node2 = reverselist(node2);
 
        node = new Node(0);

        Node curr = node;
        while (node1 != null || node2 != null) {
 
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }
 
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }
 
        node = node.next;
    }
    public void show(){
        Node node = head;
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
      public static void main(String[] args){
        arrange() list = new arrange();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);
        list.rearrange(head);
        list.show();
      }
}
