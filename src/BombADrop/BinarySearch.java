package BombADrop;

public class BinarySearch {
    public static void main(String[] args) {
          int[] arr = {-21,-11,-20, 21 ,33,55,77,88,99};
          int targ = 369;
          int op = binarySearch(arr,targ);
          System.out.println(op);
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return Integer.MIN_VALUE;
    }
}
