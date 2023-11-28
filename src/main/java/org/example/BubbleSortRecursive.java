package org.example;

public class BubbleSortRecursive {
    private int[] sort_nums;

    public void bubble_sort_recursion(int[] nums){
        this.sort_nums = nums;
        int rounds = this.sort_nums.length;
        bubble_sort_round(rounds);
    }

    private void bubble_sort_round(int rounds){
        if(rounds == 0) return;
        int i_round = 1;
        bubble_sort_i_round(rounds, i_round);
        bubble_sort_round(rounds - 1);
    }

    private void bubble_sort_i_round(int rounds, int i_round){
        if(rounds == i_round) return;
        if(this.sort_nums[i_round -1] > this.sort_nums[i_round]){
            swap(i_round -1, i_round);
        }
        bubble_sort_i_round(rounds, i_round + 1);
    }

    public void bubble_sort(int[] nums){
        this.sort_nums = nums;
        for(int round=this.sort_nums.length; round>0; round--){
            for(int i_round=1; round > i_round; i_round++){
                if(this.sort_nums[i_round -1] > this.sort_nums[i_round]){
                    swap(i_round -1, i_round);
                }
            }
        }
    }

    private void swap(int left, int right){
        int temp = this.sort_nums[left];
        this.sort_nums[left] = this.sort_nums[right];
        this.sort_nums[right] = temp;
    }

    public void printSortNums(){
        for(int num:this.sort_nums){
            System.out.println(num);
        }
    }
}
