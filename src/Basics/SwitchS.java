package Basics;

import java.util.Scanner;

public class SwitchS {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String K = i.next();
        switch (K) {
            case "Ferrari" -> System.out.println("I'll get that red ass on 27");
            case "Pagani" -> System.out.println("I'll get that in 30z");
            case "Buggatti" -> System.out.println("I'm Buy that beauty in 32's");
            default -> System.out.println("I'll get all of Asseses within 35's");
        }
    }
}
