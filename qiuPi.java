public class qiuPi{
	public static void main(String[] args){
	System.out.println(solve(4999));}
	public static double solve(int n){
		double pi=0;
		for(int i=0;i<n;i++)
		{if(i%2==1)
			{pi=pi-((double)1/(2*i+1));
			}
			else
			{pi=pi+((double)1/(2*i+1));
			}
		}
		return pi*4;
	}
}
	