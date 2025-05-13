
class linkdelist 
{
    public static node head;
    public  static node tail;
    public static class node
    {
        int data;
        node next;
        public node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static void addf(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
       newnode.next=head;
       head=newnode;
    }
    public  static node reverse()
    {
        node prev=null;
        node curr=head;
        node next;
        while (curr!=null) 
        {
         next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;   
        }
        return prev;

    }
    public static void print(node head)
    {
        node temp=head;
        while (temp!=null) 
        {
         System.out.println(temp.data);
         temp=temp.next;   
        }
    }

}
public class reverse_ll {

    public static void main(String[] args) 
    {

        linkdelist.addf(5);
        linkdelist.addf(4); 
        linkdelist.addf(3); 
        linkdelist.addf(2); 
        linkdelist.addf(1);
        linkdelist.node ans=linkdelist.reverse();
        linkdelist.print(ans);

    }
}