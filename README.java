# JAVA22
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        int k=array[0];
        int count=1;
        for(int i=1;i<len;i++){
        if(k==array[i]){
          count++;
        }
        else if(k!=array[i]){
          count--;
        }
        if(count==0){
          k=array[i];
          count=1;
        }
        }
        int num=0;
        for(int j=0;j<len;j++){
        if(array[j]==k){
          num++;
        }
        }
      if(num*2<=len){
        return 0;
      }
      else {
        return k;
      }
    }
}
