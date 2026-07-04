package Interview;

public class RemoveDupli {
    public static void main(String[] args) {
        int[] arr = {11,11,21,33,35,85,88,13,13,14,14};
        System.out.println("Actual List: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j <i ; j++) {
                if (arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
                System.out.print(arr[i]+" ");
        }
    }

}
