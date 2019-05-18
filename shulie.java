import java.util.Scanner;
import java.util.Arrays;
public class shulie{
	public static void main(String[] args){
		Scanner sca=new Scanner(System.in);
		int n=sca.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sca.nextInt();
		}
		Arrays.sort(a);
		Boolean flag=true;
		int d=a[1]-a[0];
		for(int j=2;j<a.length;j++)
		{
			if(a[j]-a[j-1]!=d)
			{flag =false;
		System.out.println("impossible");
		break;
			}	
		}
		if(flag)
		{System.out.println("possible");
		}
	}
}	
		

	