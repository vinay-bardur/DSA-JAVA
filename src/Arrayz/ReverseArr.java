package Arrayz;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,11,21,35,95,369,2047,874462,11,1};
//        swap(arr,0,3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int indx1,int indx2){
        int temp = arr[indx1];
        arr [indx1]=arr[indx2];
        arr[indx2] = temp;
    }

}
