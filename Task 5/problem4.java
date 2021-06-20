//find the intersection of two linked list
public class intersectionOfLinkList {
    Node head1, head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public int getNode(){
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d=0;
        if(c1>c2){
            d= c1-c2;
            return getIntersection(d, head1, head2);
        }
        else{
            d = c2-c1;
            return getIntersection(d, head2, head1);
        }
    }

    public int getIntersection(int d, Node n1, Node n2){
        Node curr1 = n1;
        Node curr2 = n2;
        for(int i=0; i<d; i++){
            if(curr1==null){
                return -1;
            }
            curr1 = curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1.data == curr2.data){
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }

    public int getCount(Node n){
        int count=0;
        while(n!=null){
            count++;
            n = n.next;
        }
        return count;
    }

    public static void main(String[] args){
        intersectionOfLinkList list = new intersectionOfLinkList();
        list.head1 = new Node(1);
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);
        list.head1.next.next.next = new Node(4);

        list.head2 = new Node(5);
        list.head2.next = new Node(3);
        list.head2.next.next = new Node(4);

        System.out.print("Intersection node is: "+list.getNode());
    }
}
