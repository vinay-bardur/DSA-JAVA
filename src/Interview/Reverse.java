package Interview;

public class Reverse {
    public static void main(String[] args) {
        String a = "Deloitte";
        String rev = "";
        for(int i = a.length()-1;i >= 0; i--){
            rev +=a.charAt(i);
        }
        System.out.println(rev);
    }
}
