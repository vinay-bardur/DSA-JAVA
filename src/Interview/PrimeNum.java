package Interview;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(isPrime(97));
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
