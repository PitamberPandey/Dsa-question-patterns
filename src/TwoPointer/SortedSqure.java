package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSqure {
    static void main(String[] args) {

        int  [] arr={-4,-3,1,3,5};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }


        public  static int[] sortedSquares(int[] nums) {
            int n = nums.length;
            List<Integer> neg = new ArrayList<>();
            List<Integer> pos = new ArrayList<>();


            for (int num : nums) {
                if (num < 0)
                    neg.add(num);
                else
                    pos.add(num);
            }


            if (neg.size() == 0) {
                for (int i = 0; i < pos.size(); i++)
                    pos.set(i, pos.get(i) * pos.get(i));
                return pos.stream().mapToInt(Integer::intValue).toArray();
            }


            if (pos.size() == 0) {
                for (int i = 0; i < neg.size(); i++)
                    neg.set(i, neg.get(i) * neg.get(i));
                Collections.reverse(neg);
                return neg.stream().mapToInt(Integer::intValue).toArray();
            }


            int i = 0, j = 0, id = 0;
            int n1 = neg.size();
            int n2 = pos.size();
            int[] res = new int[n1 + n2];


            for (i = 0; i < n1; i++)
                neg.set(i, neg.get(i) * neg.get(i));
            Collections.reverse(neg);

            for (i = 0; i < n2; i++)
                pos.set(i, pos.get(i) * pos.get(i));


            i = 0;
            j=0;
            while (i < n1 && j < n2) {
                if (neg.get(i) <= pos.get(j)) {
                    res[id++] = neg.get(i++);

                } else {
                    res[id++] = pos.get(j++);
                }
            }

            while (i < n1)
                res[id++] = neg.get(i++);

            while (j < n2)
                res[id++] = pos.get(j++);

            return res;

    }
}
