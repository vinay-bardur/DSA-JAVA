package Basics;

import java.util.Arrays;

public class ChangeVal {
    public static void main(String[] args) {
        int[] arr = {1,21,33,55,95,369};
        getChange(arr);
        System.out.println(Arrays.toString(arr));

        String nam = "The Great Vinay";
        getChangeNam(nam);
        System.out.println(nam);
    }

    private static void getChangeNam(String Nanu) {
        Nanu = "Nenu";
    }


    private static void getChange(int[] Mamba) {
        Mamba[0] = 24;
    }
}
