package com.example.demo;

/**
 * ssbfenqi
 * Date:2021/11/15
 * Timme:18:58
 * author: libanglei
 */
public class Solution {
    public static int removeDuplicates(int[] nums) {
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝

        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int i = 0;
        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
                System.out.println(nums[i-1]);
            }

        }
        System.out.println(nums[i]);
        return i+1;
    }
    public static void main(String[] args) {
        int[] a = {0,0,1,1,2};
        int i = removeDuplicates(a);
        System.out.println("数组的长度为"+i);

    }

}
