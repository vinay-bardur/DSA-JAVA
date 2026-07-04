package BombADrop;

public class InfiniteArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88};
        int target = 33;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //find the rang first
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range
        while (target > arr[end]) {
            int tmep = end + 1;
            //double the box value;
            //end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = tmep;
        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            //int mid = (start + end) /2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
