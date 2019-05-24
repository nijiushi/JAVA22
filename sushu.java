
public class sushu{
public static void main(String[] args){
	int sum=0;
	for(int i=0;i<999;i++){
		if(IsSuShu(i)){
			System.out.print(i+" ");
			sum++;
			if(sum%20==0){
				System.out.println();
			}
		}
	}
}
public static boolean IsSuShu(int i){
	for(int j=2;j<Math.sqrt(i);j++){
		if(i%j==0){
			return false;
		}
	}
	return true;
}
}

/*public class shuiXianHua{
public static void main(String[] args){
 int sum=0;
for(int i=0;i<999;i++){
 int hundred=i/100;
 int ten=i/10%10;
 int bits=i%10;
 int shu=hundred*hundred*hundred+ten*ten*ten+bits*bits*bits;
 if(shu==i){
  sum++;
 System.out.println(i+" ");
 }
}
 System.out.println();
 System.out.println("水仙花个数为"+sum);
}
}



	
