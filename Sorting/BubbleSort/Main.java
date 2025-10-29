package Sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {
        int nums[] = {5, 1, 4, 2, 8};
        int temp=0;
        System.out.println("Array Before Selection Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array After Selection Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
