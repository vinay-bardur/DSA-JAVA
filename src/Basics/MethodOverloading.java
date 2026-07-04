package Basics;

public class MethodOverloading {
    public static void main(String[] args) {
        over(95);
        over("Hello MaMa");
    }
    static void over(int z){
        System.out.println(z);
    }

    static void over (String numi){
        System.out.println(numi);
    }
}
