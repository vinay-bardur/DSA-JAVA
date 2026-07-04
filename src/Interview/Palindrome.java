package Interview;

public class Palindrome {
    public static void main(String[] args) {
        String m = "nooin";
        String rev = "";
        for (int i = m.length()-1; i >=0 ; i--) {
            rev += m.charAt(i);
        }if (m.equals(rev)){
            System.out.println("PALI");
        }else{
            System.out.println("NOT PALI");
        }
    }
}

