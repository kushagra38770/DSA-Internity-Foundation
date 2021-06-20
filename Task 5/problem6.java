//check whether the given linked list is palindrome or not.
public class palindrome {
    Node head;
    Node slowNode, fastNode, secondHalf;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    boolean checkPalindrome(Node head){
        slowNode = head;
        fastNode = head;
        Node prevSlowNode = head;
        boolean res = false;
        if(head!=null && head.next != null){
            while(fastNode!=null && fastNode.next!=null){
                fastNode = fastNode.next.next;
                prevSlowNode = slowNode;
                slowNode = slowNode.next;
            }
            if(fastNode!=null){
                slowNode = slowNode.next;
            }
            secondHalf = slowNode;
            prevSlowNode.next = null;
            reverse();
            res = comparision(head, secondHalf);
        }
        return res;
    }

    public void reverse(){
        Node next=secondHalf,  curr =secondHalf;
        Node prev = null;
        while(next!=null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        secondHalf = prev;
    }

    boolean comparision(Node n1, Node n2){
        if(n1.data!=n2.data){
            return false;
        }
        else{
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    public static void main(String[] args){
        palindrome list = new palindrome();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);
        if(list.checkPalindrome(list.head)==true){
            System.out.print("Is Palindrome");
        }
        else{
            System.out.print("Is not Palindrome");
        }
    }
}
