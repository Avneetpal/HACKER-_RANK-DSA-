class linked 
{
    public static node head;
    public static node tail;
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
    public void addfirst(int data)
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
    public void addlast(int data)
    {
        node newnode=new node(data);
       if(head==null)
       {
        head=tail=newnode;
        return ;
       }
        node curr=head;
        while (curr.next!=null) 
        {
         curr=curr.next;   
        }
        curr.next=newnode;
        

    }
    public void print()
    {
        node temp  =head;
        if(head==null)
        {
            return;
        }
        while (temp!=null) 
        {
          System.out.println(temp.data);
          temp=temp.next;   
        }
    }
    
}
public class Instert_at_tail
{
    public static void main(String[] args) {
        linked ll=new linked();
        ll.addfirst(5);
        ll.addfirst(8);
        ll.addfirst(9);
        ll.addlast(2);
        ll.addlast(4);
        ll.print();
    }
}