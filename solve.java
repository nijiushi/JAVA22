public class solve{
public static void main(String[] args) {
        System.out.println(JumpFloor(5));
    }
    public static int JumpFloor(int a) {
        if (a == 1) {
            return 1;
        } else if (a == 2) {
            return 2;
        }else {
            return JumpFloor(a - 1) + JumpFloor(a - 2);
        }
    }
}