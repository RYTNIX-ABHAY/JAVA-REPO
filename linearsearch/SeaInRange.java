package linearsearch;

public class SeaInRange {
    public static void main(String[] args) {
        int[] arr ={1,34,24,43,45,43};
        int target = 43;
        System.out.println(search(arr ,target));

    }
// search in range [1-5]
 static int  search(int[] arr, int target) {
        if (arr.length==0){
            return -1;
        }
        for (int i=2;i<=5;i++){
            if(arr[i]==target){
                return i;
            }
        }return  -1;
    }
}
