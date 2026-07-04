package BombADrop;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 21 ,33,55,77,88,99,-21,-11,-20};
        int targ = 88;
        int op = orderAgoBS(arr,targ);
        System.out.println(op);

    }

    static int orderAgoBS(int[] arr, int targ){

        int start =0;
        int end = arr.length-1;

        // find asce or desc
        boolean isAsec = arr[start] < arr[end];

        while (start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == targ){
                return mid;
            }

            if (isAsec){
                if (targ < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
            else{
                if (targ > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

}