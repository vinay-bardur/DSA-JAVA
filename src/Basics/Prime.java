package Basics;

public class Prime {
    public static void main(String[] args) {
//        Scanner op = new Scanner(System.in);
//        int a = op.nextInt();
//        System.out.println(isPrime(a));
//        System.out.println(isArmstrong(111));
        for (int i = 100; i < 1000 ; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int l) {
        int org = l;
        int sum = 0;
        while (l > 0) {
            int rem = l % 10;
            l = l / 10;
            sum = sum + rem * rem * rem;
        }
        return sum==org;
    }


    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= a) {
            if (a % c == 0){
                return false;
            }
            c++;
        }
        return c * c > a;
    }
}
