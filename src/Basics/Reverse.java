package Basics;

public class Reverse {
    public static void main(String[] args) {
        int b = 987654;

        int ans = 0;

        while(b > 0){
            int rem = b % 10;
            b /= 10;

            ans = ans * 10 + rem;
        }


        System.out.println(ans);
    }
}
