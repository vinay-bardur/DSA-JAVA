package BombADrop;

public class MountainOwee {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderAgoBS(arr,target,0,peak);
        if(firsttry!= -1){
            return firsttry;
        }
        return orderAgoBS(arr,target,peak+1,arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgoBS(int[] arr, int target , int start , int end){

        // find asce or desc
        boolean isAsec = arr[start] < arr[end];

        while (start <= end){
            //int mid = (start + end) /2;
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsec){
                if (target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
            else{
                if (target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
