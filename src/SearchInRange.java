public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={434,767,653,675,876};
        int target= 653;
        System.out.println(LinearSearch(arr, target, 1,4));
    }

    static int LinearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return-1;
        }
        for (int index = start; index <end ; index++) {
            int element = arr[index];
            if(element== target){
                return index;
            }

        }
        return-1;
    }
}
