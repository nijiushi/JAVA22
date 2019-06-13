class Node{
int val;
Node next;
Node(int val){
this.val=val;
}
}
public class solution{ 
public Node partition(Node head,int x){
Node small=null;
Node big=null;
Node samllLast=null;
Node bigLast=null;
for(Node cur=head;cur!=null;cur=cur.next){
if(cur.val<x){
 if(small==null){
 small=cur;
 }
 else{
 samllLast.next=cur;
 }
 samllLast=cur;
 }
else{
if(big==null){
 big=cur;
 }
 else{
 bigLast.next=cur;
 }
 bigLast=cur;
}
}
if(small==null){
return big;
}
else{
samllLast.next=big;
if(bigLast!=null){
bigLast.next=null;
}
return small;
}
}
public static void main(String[] args){
	     Node n1=new Node(1);
         Node n2=new Node(2);
         Node n3=new Node(6);
         Node n4=new Node(9);
         Node n5=new Node(20);
		 Node n6=new Node(7);
		 Node n7=new Node(5);
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
		 n5.next=n6;
		 n6.next=n7;
		 solution s=new solution();
		 Node result=s.partition(n1,7);
		 while(result!=null){
		 System.out.println(result.val+" ");
		 result=result.next;
		 }
		 }
		 }
		 

