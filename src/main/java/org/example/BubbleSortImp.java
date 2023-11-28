package org.example;

public class BubbleSortImp {
    private int[] sort_nums;

    public int[] bubble_sort(int[] nums){
        this.sort_nums = nums;

        for(int round=0; round < this.sort_nums.length; round++){
            int lenth = this.sort_nums.length - round;
            for(int i_round =1; i_round<lenth; i_round++){
                if(sort_nums[i_round-1]>sort_nums[i_round]){
                    swap(i_round-1, i_round);
                }
            }
        }
        return this.sort_nums;
    }

    private void swap(int i_left, int i_right){
        int temp = this.sort_nums[i_right];
        this.sort_nums[i_right] = this.sort_nums[i_left];
        this.sort_nums[i_left] = temp;
    }

//    public int[] bubble_sort(int[] nums){
//        if(nums.length <= 1) return nums;
//        sort_nums = nums;
//
//        for(int i= sort_nums.length; i>=0; i--){
//            System.out.println("i"+i);
//            for(int j=0; j<i-1; j++){
//                if(sort_nums[j] > sort_nums[j+1]){
//                    int tempNum = sort_nums[j];
//                    sort_nums[j] = sort_nums[j+1];
//                    sort_nums[j+1] = tempNum;
//                }
//            }
//        }
//        return sort_nums;
//    }
}
