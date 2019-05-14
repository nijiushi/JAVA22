public class disss{
public static void main(String[] args){
	
	System.out.printf("%s",reverse("hello"));
}
public static String reverse(String s)
{
	int length=s.length();
	String r=" ";
	for(int i=length-1;i>=0;i--)
	{char c=s.charAt(i);
    r=r+c;
	}
	return r;
}
}
