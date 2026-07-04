package Basics;

import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter in C tmep: ");
        float C = in.nextFloat();
        float F = (C * 9/5) + 32 ;
        System.out.println(F);
    }
}
