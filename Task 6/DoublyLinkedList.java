class DoublyLinkedList
{
	Node head,tail;
	static class Node {
    int data;
    Node prev;
    Node next;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(1);
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.deleteFromIndex(2);
        dll.show();
	}
	public void show(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void deleteFromIndex(int index){
        Node temp=head;
        for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        if(temp.next==null)
        {   tail=tail.prev;
            tail.next=null;
            temp=null;
        }
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp = null;
        }
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
}
