public class  PalindromeList{
public Node middle(Node head){
Node fast=head;
Node slow=head;
while(fast!=null){
   fast=fast.next;
if(fast==null){
   break;
}
fast=fast.next;
slow=slow.next;
}
  return slow;
}
public Node reverse(Node head){
Node result=null;
Node cur=head;
while(cur!=null){
   Node next=cur.next;
   cur.next=result;
   result=cur;
   cur=next;
}
  return result;
}
public boolean chk(Node A){
         Node mid=middle(A);
	     Node h2=reverse(mid); 
	     Node n1=A;
	     Node n2=h2;
	     while(n1!=null&&n2!=null){
	        if(n1.val!=n2.val){
	          return false;
	        }
	     n1=n1.next;
	     n2=n2.next;
	     }
	  return true;
	}
	public static void main(String[] args){
	     Node n1=new Node(1);
         Node n2=new Node(2);
         Node n3=new Node(3);
         Node n4=new Node(4);
         Node n5=new Node(3);
		 Node n6=new Node(2);
		 Node n7=new Node(1);
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
		 n5.next=n6;
		 n6.next=n7;
		 PalindromeList s=new PalindromeList();
	     boolean f=s.chk(n1);
		 if(f==true){
		    System.out.println("是回文");
		 }
		 else{
		    System.out.println("不是回文");
		 }
	}
}
		
		 
	
	
