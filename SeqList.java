import java.util.Arrays;
public class SeqList{
private int[] array;
	private int size;
	public SeqList(){
	size=0;
	array=new int[10];
	}
	public void pushFront(int element){//在顺序表前插入
		   for(int i=size-1;i>=0;i--){
		   array[i+1]=array[i];
		   }    
	         array[0]=element; 
			 size++;
	}
	public void pushBack(int element){//在顺序表后插入
		array[size++]=element;
	}
	public void insert(int index,int element){//指定下标插入
		for(int i=size-1;i>=index;i--){
		array[i+1]=array[i];
		}
	   array[index]=element; 
	   size++;
	}
	public void popFront(){//头部删除
		for(int i=0;i<size-1;i++)
		{ array[i]=array[i+1];
	}
	size--;
	}
	public void popBack(){//尾部删除
		array[--size]=0;
	}
	public int indexOf(int element) {//查找
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return i;
			}
		}	
		return -1;
	}
	
	public String toString(){
	return Arrays.toString(Arrays.copyOf(array,size));
	}
	public static void main(String[] args){
		SeqList seqList=new SeqList();
		seqList.pushBack(1);
		seqList.pushBack(2);
		seqList.pushBack(3);
		System.out.println(seqList.toString());
		seqList.pushFront(1);
		System.out.println(seqList.toString());
        seqList.insert(1,9);
		System.out.println(seqList.toString());
		seqList.popFront();
		System.out.println(seqList.toString());
		seqList.popBack();
		System.out.println(seqList.toString());
	}
}
		

