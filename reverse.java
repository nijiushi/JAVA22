import java.util.ArrayList;
public class Solution {
    ArrayList list=new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        if(listNode!=null){
          printListFromTailToHead(listNode.next);
          list.add(listNode.val);
        }
      return list;
    }
}
