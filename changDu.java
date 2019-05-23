import java.util.Scanner;
public class changDu{
public static void main(String[] args){
System.out.println("输入字符串:");
Scanner sca=new Scanner(System.in);
String s=sca.nextLine();
System.out.println("字符串长度为:"+llong(s));
}
public static int llong(String s){
	char[] sh=s.toCharArray();
	return sh.length;
}
}