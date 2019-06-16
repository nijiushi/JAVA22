
class Node{
 int val;
 Node next=null;
 public Node(int val){
  this.val=val;
 }
}
public class point{
public int getLength(Node head){
	int n=0;
	for(Node cur=head;cur!=null;cur=cur.next){
		n++;
	}
	return n;
}
public Node getPoint(Node headA,Node headB){
int A=getLength(headA);
int B=getLength(headB);
int C=A-B;
Node longList=headA;
Node shortList=headB;
if(A<B){
	longList=headB;
	shortList=headA;
	C=B-A;
}
for(int i=0;i<C;i++){
	longList=longList.next;
}
while(longList!=shortList){
	longList=longList.next;
	shortList=shortList.next;
}
return longList;
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
		 Node c1=new Node(5);
         Node c2=new Node(2);
         Node c3=new Node(2);    
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
		 n5.next=n6;
		 n6.next=n7;
		 n7.next=n8;
		 c1.next=c2;
		 c2.next=c3;
		 c3.next=n4;
		 point s=new point();
		 Node result=s.getPoint(n1,c1);
		 System.out.println(result.val);
}
}
//javac -encoding UTF-8 point.java




