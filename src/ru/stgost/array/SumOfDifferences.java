package ru.stgost.array;

public class SumOfDifferences {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i - 1] + nums[i];
        }
        return sum;
    }
}
