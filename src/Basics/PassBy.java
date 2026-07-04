package Basics;

public class PassBy {
    public static void main(String[] args) {
        String personaa = getMyDaddy("Yoksoo Yujiroo Telsee!!");
        System.out.println(personaa );
    }

    private static String getMyDaddy(String nam) {
       String mssg = "Yarree Nenuu Tellinaa Vodiyuvee Sumnee nen Kelsaa Nodeeeyyy" + nam;;
        return mssg;
    }
}
