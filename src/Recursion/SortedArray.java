package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr= {1,3,47,8,4,2};
        System.out.println(sortedArray(arr,0));
    }

    static boolean sortedArray(int[] arr, int index) {
        //base condition
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sortedArray(arr, index + 1);
    }
}
