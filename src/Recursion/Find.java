package Recursion;

public class Find {
    public static void main(String[] args) {
      int[] arr= {2,3,1,4,5};
      System.out.println(find(arr,4,3));
        System.out.println(findIndex(arr,4,3));

    }
    static boolean find(int [] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]== target || find(arr,target,index +1);
    }
    static int findIndex(int [] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    }


