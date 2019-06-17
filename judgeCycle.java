
class Node {
	int val;
	Node next;	
	Node(int val) {
		this.val = val;
	}
}
public class judgeCycle{
public Node cycle(Node head){
	 if (head == null) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        do {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        } while (fast != null && fast != slow);       
        if (fast == null) {
            return null;
        }      
        Node p1 = head; 
        Node p2 = slow;
        while (p1 != p2) {  
            p1 = p1.next;
            p2 = p2.next;
        }      
        return p1;
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
		 Node n9=new Node(5);    
         n1.next=n2;
         n2.next=n3;
         n3.next=n4;
         n4.next=n5;
		 n5.next=n6;
		 n6.next=n7;
		 n7.next=n8;
		 n8.next=n9;
		 n9.next=n4;	 
		 judgeCycle s=new judgeCycle();
		 Node result=s.cycle(n1);
		 System.out.println(result.val);
}
}





