package Interview;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int x = i.nextInt();
        int y = i.nextInt();
        int z = i.nextInt();

//
//        int max = x;
//        if (y > max ){
//            max = y;
//        }
//        if (z > max){
//            max = z;
//        }
        int max = Math.max(z,Math.max(x,y));
        System.out.println(max);

        int[] arr = {3,7,6,5,4,8,9};
        int maxi = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j]>maxi)
                maxi = arr[j];
        }
        System.out.println("Largest DDDk = "+maxi);


    }
}

