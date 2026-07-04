import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        int y = i.nextInt();
        int z = i.nextInt();
//
//        int max = x;
//        if (y > max ){
//            max = y;
//        }
//        if (z > max){
//            max = z;
//        }
        int max = Math.max(z,Math.max(x,y));
        System.out.println(max);
    }
}
