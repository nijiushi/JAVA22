interface Iterator{
	boolean hasNext();
	int next();
}
interface List{
	void pushFront(int val);
	void pushBack(int val);
	void insert(int index,int val);
	int size();
	void display();
}
abstract class AbstractList implements List{
	protected int size;
	public void pushFront(int val){
		insertAll(0,val);
	}
	public void pushBack(int val){
		insertAll(size,val);
	}
	public void insert(int index,int val){
	if(index<0||index>size){
		return;
	}
	insertAll(index,val);
	}
	abstract void insertAll(int index,int val);
	public int size(){
		return size;
	}
}
class ArrayList extends AbstractList implements List{
	public int[] array=new int[100];
	public void insertAll(int index,int val){
		for(int i=size;i>index;i--){
			array[i]=array[i-1];
		}
		array[index]=val;
		size++;
	}
public void display(){
	for(int i=0;i<size;i++){
		System.out.println(array[i]);
	}
}
}
public class LL{
	private static void test(List llist){
	    llist.pushBack(1);
		llist.pushFront(0);
		llist.pushBack(2);
		llist.insert(2,1);
		llist.display();
	}
	public static void main(String[] args){
		test(new ArrayList());
	}
}
