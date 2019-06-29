interface Iterator{
	boolean hasNext();
	int next();
}

interface List{
void pushFront(int val);
	void pushBack(int val);
	void insert(int index, int val);
	int size();
	Iterator iterator();
}

interface RandomAccess{
}

abstract class AbstractList implements List{
	protected int size;
	@Override 
	public void pushFront(int val){
		insertInternal(0,val);
	}
	@Override 
	public void pushBack(int val){
		insertInternal(size,val);
	}
	@Override 
	public void insert(int index,int val){
		if(index<0||index>size){
			System.out.println("输入下标错误");
		}
	    insertInternal(index,val);
	}
	abstract void insertInternal(int index, int val);
	@Override 
	public int size(){
		return size;
	}
}

class ArrayList extends AbstractList implements List,RandomAccess{
	private class ArrayListIterator implements Iterator{
		private int curIndex;
		ArrayListIterator() {
			curIndex=0;
		}
		@Override
		public boolean hasNext(){
			return curIndex<size();
		}
		@Override
		public int next(){
			int val=array[curIndex];
			curIndex++;
			return val;
		}
	}
	
	public int[] array=new int[100];
	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	@Override
	protected void insertInternal(int index, int val) {
		// 不考虑扩容问题
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}	
		array[index] = val;
		size++;
	}
}

public class LL{
	private static void testList(List list){
		list.pushBack(1);
		list.pushBack(2);
		list.pushFront(10);
		list.insert(3, 30);
		Iterator it1 = list.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}
	public static void main(String[] args){
		testList(new ArrayList());
	}
}
		
   
		