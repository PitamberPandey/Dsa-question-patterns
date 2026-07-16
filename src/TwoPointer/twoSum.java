package TwoPointer;

import java.util.Arrays;

public class twoSum {
    static void main(String[] args) {

        int [] numbers={1,3,4,5};
        int target=4;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while (i<j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j+1};
            }
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else
                i++;

        }
        return new int[]{-1,-1};
    }
}
