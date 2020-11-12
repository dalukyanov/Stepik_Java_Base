package task_2_4_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 8, 17};
        int[] a2 = {0, 4, 8, 9};

        System.out.println(Arrays.deepToString(new int[][]{mergeArrays(a1, a2)}));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;

        int[] res = new int[a1.length + a2.length];

        for (int k = 0; k < res.length; k++) {
            if (i < a1.length && j < a2.length) {
                if (a1[i] <= a2[j]) {
                    res[k] = a1[i];
                    i++;
                } else {
                    res[k] = a2[j];
                    j++;
                }
            } else if (i < a1.length) {
                res[k] = a1[i];
                i++;
            } else {
                res[k] = a2[j];
                j++;
            }
        }

        return res;
    }
}