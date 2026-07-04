package Basics;

public class CountRep {
    public static void main(String[] args) {
        int v = 3948795;

        int c = 0;
        while (v > 0){
            int rem = v % 10;
            if (rem == 9){
                c++;
            }
            v = v / 10;
        }
        System.out.println(c);
    }
}
