package linearsearch;

public class Mxin2D {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56}
        };
        System.out.println(max(arr));
    }

static int max(int[][] arr) {
       int max = Integer.MIN_VALUE;
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                }
            }
        }
return max;
    }
}
