package BombADrop;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, -11,33,369,-9389,-108345};
//        System.out.println(findNumbers(nums));
//        System.out.println(digits(0));
        System.out.println(digit2(-98274524));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }


        return count;
    }

    // to check even or not
    static boolean even(int num) {
        int numofDigits = digit2(num);
//        if (numofDigits % 2== 0){
//            return true;
//        }
        return numofDigits % 2== 0;
    }

    static int digit2(int num){
        if(num <0){
            num = num *-1;
        }
        return (int)(Math.log10(num)) + 1;

    // count the num of digits in a number
//    static int digits(int num){
//
//        if(num <0){
//            num = num *-1;
//        }
//
//        if (num == 0){
//            return 1;
//        }
//
//
//        int count = 0;
//        while (num > 0){
//            count ++;
//            num = num /10;
//
//        }
//        return count;
    }
}
