package BombADrop;

public class Mountain {
    public static void main(String[] args) {

    }

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) /2;
             if(arr[mid] > arr[mid+1]){
                //descreasing part of the array (this may be the answer look at the left)!!
                 //this is why end!= mid -1
                 end = mid;
             }else {
                 //you are in asc part of the array
                 start = mid + 1;
                 //bcz we know that mid+1 element > mid element
             }
        }
// the end , start == end & pointing to the largest number because of the 2 checks above
// start & end are always trying to find the max element in the above 2 checks
// ellaboration : at every point of time start & end , they have the best possible answer till that time
// If we are saying that only one item is remaining, hence cuz of above line that is the largest element !!
         return start;
    }
}
