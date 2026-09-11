
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        int count=0;
        ListNode tempee=head;
        while(tempee!=null){
            tempee=tempee.next;
            count++;

        }
        if(count==n)return head.next;
        int pos=count-n;
        
        ListNode temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;

        }
        ListNode del=temp.next;
        if(temp.next.next!=null){
            temp.next=del.next;
        }
        else{
            temp.next=null;
        }
        return head;
    }
}