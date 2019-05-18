public class binary{
	public static void main(String[] args){
	System.out.println(reverse("girl"));
	System.out.println(hex(325));}
	public static String reverse(String s){
		String r=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
           char ch=s.charAt(i);
		   r=r+ch;
		}
		return r;
	}
	public static String hex(int n){
		String hex=" ";
		while(n>=10){
			int temp=n%16;
			n/=16;
			if(temp<10)
			{
				hex+=temp;
			}
			else
			{
				char ch=(char)('A'+temp-10);
				hex+=ch;
			}
		}
		if(n!=0)
		{
			hex+=n;
		}
		return reverse(hex);
	}
}
	