import java.util.Arrays;

/**
 * Created by MAXIMILLION on 6/8/14.
 */

public class MaxDiff {
    public static int maxDifference(int[] a) {
        System.out.println("\na: " + Arrays.toString(a));
        if (a.length == 0) {
            return -1;
        }
        int maxDiff = -1;
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            int diff = a[i] - min;
            if (diff > maxDiff && diff > 0) {
                maxDiff = diff;
            }
        }
        System.out.println("result: " + maxDiff);
        return maxDiff;
    }
}
