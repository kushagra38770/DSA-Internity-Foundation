/*430. Flatten a Multilevel Doubly Linked List
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node n = head;
        while(n!=null){
            if(n.child == null){
                n = n.next;
                continue;
            }
            Node temp = n.child;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n.next;
            if(n.next!=null){
                n.next.prev = temp;
            }
            n.next = n.child;
            n.child.prev = n;
            n.child = null;
        }
        return head;
    }
}
