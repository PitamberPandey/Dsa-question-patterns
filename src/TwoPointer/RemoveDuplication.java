package TwoPointer;

public class RemoveDuplication {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 2, 2, 3};

        int ans = removeDuplicates(arr);

        System.out.println(ans);

        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0)
            return 0;

        int i = 0;
        int j = 1;

        while (j < arr.length) {

            if (arr[i] == arr[j]) {
                j++;
                continue;
            }

            i++;
            arr[i] = arr[j];
            j++;
        }

        return i + 1;
    }
}