public class SearchInArray {
    public static void main(String[] args) {
       int[] nums= {23,54,56,76,65,56,-21,-65};
       int target = 56;
       int ans = LinearSearch(nums,target);
        System.out.println(ans);
    }
        static int LinearSearch(int[] arr, int target){
            if(arr.length==0){
                return-1;
            }
            for (int index = 0; index < arr.length ; index++) {
                int element = arr[index];
                if(element== target){
                    return index;
                }

            }
            return-1;
        }
    }

