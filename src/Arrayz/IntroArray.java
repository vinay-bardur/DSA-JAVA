package Arrayz;

public class IntroArray {
    public static void main(String[] args) {
        int[] num = {21,23,43,12,54,65,76,8,11};
        int target = 11;
        int ass = linear2(num, target);
        System.out.println(ass);
    }

    private static int getAss(int[] num, int target) {
        if (num.length == 0) {
            return Integer.MAX_VALUE;
        }

        for(int element: num){
            if (element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;

    }

    static int linear2(int[] arr, int target){
        if(arr.length == 0 ){
            return Integer.MAX_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
