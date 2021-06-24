//2. Add two numbers     -----------LEETCODE PROBLEM ON LINKED LIST---------- 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,temp=null;
        //int i1=0, i2=0;
        long num=0;
        while(l1!=null || l2!=null){
            num = num/10;
            if(l1!=null){
                num+=l1.val;
                //i1++;
                l1 = l1.next;
            }
            if(l2!=null){
                num+=l2.val;
                //i2++;
                l2 = l2.next;
            }
            ListNode l3 = new ListNode();
            l3.val = (int)num%10;
            if(head==null){
                head = temp = l3;
            }
            else{
                temp.next = l3;
                temp = l3;
            }
            temp.next = null;
        }
        if(num>=10){
            ListNode l4 = new ListNode();
            l4.val = 1;
            temp.next = l4;
            temp = l4;
            temp.next = null;
        }
        //long n = num;
        /*if(n==0){
            ListNode l4 = new ListNode();
            l4.val = 0;
            return l4;
        }*/
        /*while(n!=0){
            ListNode l3 = new ListNode();
            l3.val = (int)n%10;
            n = n/10;
            if(head==null){
                head = temp = l3;
            }
            else{
                temp.next = l3;
                temp = l3;
            }
            temp.next = null;
        }*/
        return head;
    }
}
