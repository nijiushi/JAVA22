public class solvehigh{
public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }
    public static int JumpFloor(int a) {
       int result=0;
	  int f1=1;
	   int f2=2;
	   for(int i=3;i<=a;i++)
	   {result=f1+f2;
       f1=f2;
       f2=result;
	   }
	   if(a<=0)
	   {
	   return 0;}
	   if(a==1)
	   {
	   return 1;}
	   if(a==2)
	   {
	   return 2;}
	   return result;
    }
}