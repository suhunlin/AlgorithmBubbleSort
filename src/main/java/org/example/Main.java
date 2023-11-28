package org.example;

public class Main {
    public static void main(String[] args) {
        int nums[] = {17, 8, 2, 6, 10, 4};
        BubbleSortRecursive bubbleSortRecursive = new BubbleSortRecursive();
//        bubbleSortRecursive.bubble_sort(nums);
        bubbleSortRecursive.bubble_sort_recursion(nums);
        bubbleSortRecursive.printSortNums();
//        BubbleSortImp bubbleSortImp = new BubbleSortImp();
//        int after_bubble_sort[] = bubbleSortImp.bubble_sort(nums);
//        for(int num:after_bubble_sort){
//            System.out.println(num);
//        }
    }
}