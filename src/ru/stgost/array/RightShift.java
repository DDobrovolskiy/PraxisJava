package ru.stgost.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        int amount = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int amount0  = nums[i];
            nums[i] = amount;
            amount = amount0;
        }
        nums[0] = amount;
    }
}
