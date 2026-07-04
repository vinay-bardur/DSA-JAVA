package Interview;

public class Swap {
    public static void main(String[] args) {
        int a = 21, v = 1;
        a = a+v;
        v = a-v;
        a = a-v;
        System.out.println("a="+a+" v="+v);
    }
}
