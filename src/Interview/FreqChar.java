package Interview;

public class FreqChar {
    public static void main(String[] args) {
        String v = "The Great V.G.B";
        for (int i = 0; i < v.length(); i++) {
            int count =0;
            for (int j = 0; j <v.length() ; j++) {
                if (v.charAt(i)==v.charAt(j))
                    count++;
            }
            System.out.println(v.charAt(i)+" = "+ count);
        }
    }
}
