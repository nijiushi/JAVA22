class Node {
	int val;
	Node random;
	Node next;
	Node(int val) {
		this.val = val;
	}
}
class Copy{
	Node copy(Node head) {
		if (head == null) {
			return null;
		}
		Node cur = head;
		while (cur != null) {
			Node node = new Node(cur.val);
			node.next = cur.next;
			cur.next = node;
			cur = node.next;
		}
		cur = head;
		while (cur != null) {
			if (cur.random != null) {
				cur.next.random = cur.random.next;
			}
			cur = cur.next.next;
		}
		Node newHead = head.next;
		cur = head;
		while (cur != null) {
			Node node = cur.next;
			cur.next = node.next;
			if (node.next != null) {
				node.next = node.next.next;
			}
			cur = cur.next;
		}
		return newHead;
	}
}
public class CC{
	static void testCopy(){	
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(3);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n1.random=n2;
		n2.random=n1;
		n3.random=n3;
		Node result=new Copy().copy(n1);
		for(Node cur=n1;cur!=null;cur=cur.next){
			System.out.printf("Node(%s,%d,%s)-->%n",cur,cur.val,cur.random);
		}
		System.out.println();
		System.out.println();
		for (Node cur=result; cur!= null; cur=cur.next) {
			System.out.printf("Node(%s,%d,%s)-->%n",
				cur, cur.val, cur.random);
		}
		System.out.println();
	}
	public static void main(String[] args){
			testCopy();
		}
}
