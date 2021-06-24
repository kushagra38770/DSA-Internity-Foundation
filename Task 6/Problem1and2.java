//1.Detect cycle in a linked list
//2.Return the start of the cycle.
public class DetectCycleLinkedList {
    N head,temp;
    static class N{
        int data;
        N next;
        int flag;
        N(int d){
            data = d;
        }
    }
    public void insert(int data){
        N newNode = new N(data);
        newNode.flag = 0;
        if(head==null){
            head=temp=newNode;
        }
        else{
            temp.next = newNode;
            temp = newNode;
        }
    }
    public void show(){
        N temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void detectCycle(){
        N h = head;
        while(h!=null){
            if(h.flag==1){
                System.out.print("Cycle is present and starts from node with data: "+h.data);
                break;
            }
            h.flag = 1;
            h = h.next;
        }
    }
    public static void main(String[] args){
        DetectCycleLinkedList ll = new DetectCycleLinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.temp.next = ll.head.next;
        ll.detectCycle();
        //ll.show();
    }
}
