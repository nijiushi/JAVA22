public class Solution {
    public String replaceSpace(StringBuffer str) {
      if(str==null){
        return null;
      }	
      for(int i=0;i<str.length();i++){
        char a=str.charAt(i);
        if(a==' '){
          str.replace(i,i+1,"%20");
        }
      }
      return str.toString();
    }
}
