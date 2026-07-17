package TwoPointer;

import java.util.Arrays;

public class segregate0and1 {
    static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(segreated0and1(arr)));


    }

    public static int[] segreated0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if ( arr[i] == 0){
                i++;
            } else if (arr[j]==1) {
                j--;

            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
        return arr;
    }
}
