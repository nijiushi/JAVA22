public class delete{
public Node deletePart(Node head){
if(head==null){
    return null;
}
Node prev=new Node(0);
prev.next=head;
Node fake=prev;
Node p1=head;
Node p2=head.next;
while(p2!=null){
if(p1.val!=p2.val){
    prev=p1;
    p1=p1.next;
    p2=p2.next;
}
else{
    while(p2!=null&&p2.val==p1.val){
    p2=p2.next;
}
prev.next=p2;
p1=p2;
if(p2==null){
   break;
}
p2=p2.next;
}
}
return fake.next;
}
public static void main(String[] args){
         Node n1=new Node(1);
         Node n2=new Node(2);
         Node n3=new Node(2);
         Node n4=new Node(3);
         Node n5=new Node(6);
		 Node n6=new Node(6);
		 Node n7=new Node(9);
		 Node n8=new Node(10);
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
		 n5.next=n6;
		 n6.next=n7;
		 n7.next=n8;
		 delete s=new delete();
		 Node result=s.deletePart(n1);
		 while(result!=null){
		 System.out.println(result.val+" ");
		 result=result.next;
		 }
		 }
		 }

