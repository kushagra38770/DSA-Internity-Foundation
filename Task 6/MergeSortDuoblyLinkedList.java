//Merge sort on doubly linked List.
public class MergeSortDoublyLinkedList {
    Node head,tail;
  static class Node {
    int data;
    Node prev;
    Node next;
}
    public void insert(int data){
        Node newNode = new Node();
        newNode.data=data;
        newNode.prev=null;
        newNode.next=null;
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public Node split(Node head){
        Node fast=head, slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }

    public Node mergeSort(Node node){
        if(node==null || node.next==null){
            return node;
        }
        Node second = split(node);
        node = mergeSort(node);
        second = mergeSort(second);
        return merge(node, second);
    }

    public Node merge(Node first, Node second){
        if(first==null){
            return second;
        }
        if(second==null){
            return first;
        }
        if(first.data<second.data){
            first.next = merge(first.next,second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }
        else{
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    public void show(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main (String[] args)
    {
        // your code goes here
        MergeSortDoublyLinkedList dll = new MergeSortDoublyLinkedList();
        dll.insert(2);
        dll.insert(8);
        dll.insert(5);
        dll.insert(4);
        dll.insert(6);
        dll.mergeSort(dll.head);
        dll.show();
    }
}
