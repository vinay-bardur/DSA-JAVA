package Interview;

public class Pyramid {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 1; i <= x ; i++) {
            for (int j = i; j < x ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = 1; l <=7 ; l++) {
            for (int m = 1; m <l ; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int o = 7; o >=1 ; o--) {
            for (int p = 1; p<=o ; p++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
