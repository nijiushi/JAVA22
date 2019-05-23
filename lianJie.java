import java.util.Scanner;
public class lianJie{
public static void main(String[] args){
System.out.println("第一个字符串");
Scanner sca=new Scanner(System.in);
String str1=sca.nextLine();
System.out.println("第二个字符串");
String str2=sca.nextLine();
sca.close();
String str3=str1+str2;
System.out.println("拼接后字符串为:"+str3);
}
}