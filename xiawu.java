/*public class xiawu{
public static void main(String[] args){
int[] array={1,2,3,4,5,6};
int number=binarySearch(array,3);
System.out.println(number);
}
public static int binarySearch(int[] a,int key){
 int left=0;
 int right=a.length-1;
 int mid=0;
 while(left<=right)
 {
 mid=left+right;
 if(a[mid]>key)
 {
    right=mid-1;
 }
 else if(a[mid]<key)
 {
      left=mid+1;
 }
 else
 {return mid;
 }
 }
 return -1;
 }
}*/
/*import java.util.Arrays;
public class xiawu{
public static void main(String[] args){
int[] array={1,5,3,4,9,6};
int[] r=sort(array);
System.out.println(Arrays.toString(r));
}
public static int[] sort(int[] a){
	boolean isSwap=false;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				isSwap=true;
			}
		}
	}
	if(!isSwap)
	{
		return a;
	}
	
	else 
		return a;
}
}*/
/*class  Group{
	String name;
	int num;
	//方法 构造方法
	Group(String n,int m){
		name=n;
		num=m;
	}
	void print(String welcome){
		System.out.printf("%s %s 的 %d 位同学%n",
  welcome,//形参
  name,//属性
  num);//属性;	
};
}
public class xiawu{
	public static void main(String[] args)
	{
		Group group=new Group(
		"java10班",50);
		group.print("欢迎来到比特");
	}
}*/
class B {
	int sum;
	B(int a, int b,int c){
		System.out.println(a+b+c);
		sum=a+b+c;
	}
	void print(){
		System.out.println(sum);
	}
}
public class xiawu{
	public static void main(String[] args)
	{
	B b=new B(1,2,3);
	b.print();
	}
}

		

	
