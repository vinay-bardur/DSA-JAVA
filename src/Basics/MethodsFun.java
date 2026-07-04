package Basics;

import java.util.Scanner;

public class MethodsFun {
    public static void main(String[] args) {
//        addie();
        int z = oyo2();
        int B = z * 10 + 95;
        System.out.println(B);
    }

    static int oyo2(){
        Scanner i = new Scanner(System.in);
        System.out.println("Num 1: ");
        int yo = i.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.println("Num 2: ");
        int vo = o.nextInt();
        int boom = yo * vo;
        return boom;
    }

    static void addie(){
        Scanner i = new Scanner(System.in);
        System.out.println("Num 1: ");
        int yo = i.nextInt();
        Scanner o = new Scanner(System.in);
        System.out.println("Num 2: ");
        int vo = o.nextInt();
        int boom = yo * vo;
        System.out.println(boom);
    }
}
