package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ssbfenqi
 * Date:2021/11/16
 * Timme:11:14
 * author: libanglei 贪心算法
 */

public class maxProfit {
    /**
     * 给定一个数组 prices ，其中 prices[i] 是一支给定股票第 i 天的价格。
     * <p>
     * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
     * <p>
     * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     * <p>
     * 作者：力扣 (LeetCode)
     * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    private static int maxProfit(int[] prices) {
        int tobal = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            //原数组中如果后一个减去前一个是正数，说明是上涨的，
            //我们就要累加，否则就不累加
            tobal += Math.max(prices[i + 1] - prices[i], 0);
        }
        return tobal;

    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length - 1);//先反转全部的元素
        reverse(nums, 0, k - 1);//在反转前k个元素
        reverse(nums, k, length - 1);//接着反转剩余的
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    //把数组中从[start，end]之间的元素两两交换,也就是反转
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            start++;
            nums[end] = temp;
            end--;
        }
    }

    public static void rotate1(int[] nums, int k) {
        k = k % nums.length;
        //复制数组4-7编程一个新数组int[] rightpart = {4,5,6,7}
        int[] rightpart = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        //把这个数组的o-k(3)的数值放到nums.length - k 这个位置 的后面
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        //把复制出来的数组的rightpart的数值放到k 位置 的后面
        System.arraycopy(rightpart, 0, nums, 0, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static void rotate2(int[] nums, int k) {

        int m = 0;
        int j = nums.length - 1;
        for (int f = 3; f > m; ) {
            if (m < k) {
                for (int i = 0; i < nums.length - 1; i++) {
                    int temp = nums[i];
                    int b = nums[j];
                    nums[i] = b;
                    nums[j] = temp;
                }
                m++;
                System.out.println("向右轮转" + m + "步:" + nums);
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        //int[] a = {7, 1, 5, 3, 6, 4};
        //int[] b = {1,2,3,4,5};
        //int[] c = {7,6,4,3,1};
        //System.out.println(maxProfit(a));
        //System.out.println(maxProfit(b));
        //System.out.println(maxProfit(c));

        int[] nums = {1, 2, 3, 2, 3, 2, 2};
        int k = 3;
        //rotate(nums, k);
        //rotate1(nums, k);
        //rotate2(nums, k);

        //存在重复元素
        boolean rp = repeat(nums);
        boolean b = repeat1(nums);

        //System.out.println("数组存在相同的数据么？："+b);

        //只出现一次的数字
        //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
        //
        //说明：
        //
        //你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
        //测试异或
        int i = singleNumber(nums);
        System.out.println(i);
        System.out.println(0 ^ 2 ^ 2 ^ 3 ^ 3 ^ 1);

//两个数组的交集
        //给定两个数组，编写一个函数来计算它们的交集。
        //输入：nums1 = [1,2,2,1], nums2 = [2,2]
        //输出：[2,2]
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] returnTest = solution(nums1, nums2);
        String string = Arrays.toString(returnTest);
        System.out.println("输出两个数组的交集：" + string);

        //加一
        //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
        //
        //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
        //
        //你可以假设除了整数 0 之外，这个整数不会以零开头。
/**
 * 示例 1：
 输入：digits = [1,2,3]
 输出：[1,2,4]
 解释：输入数组表示数字 123。
 */
        int[] digits = {1, 2, 3};
        int[] returnAdd1 = SolutionAdd1(digits);
        System.out.println(Arrays.toString(returnAdd1));

        //移动零
        //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
        //输入: [0,1,0,3,12]
        //输出: [1,3,12,0,0]
        int[] nums3 = {0, 1, 0, 3, 12};
        moveZeroes(nums3);

        //两数之和
        //输入：nums = [2,7,11,15], target = 9
        //输出：[0,1]
        //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
        int[] sum = {2, 7, 11, 15};
        int target = 17;
        int[] sumrsp = twoSum(sum, target);
        System.out.println("两数之和" + Arrays.toString(sumrsp));

        //有效的数独
        //请你判断一个 9 x 9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
        //数字 1-9 在每一行只能出现一次。
        //数字 1-9 在每一列只能出现一次。
        //数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
        char[][] board = {{5, 3, '.', '.', 7, '.', '.', '.', '.'}, {6, '.', '.', 1, 9, 5, '.', '.', '.'}, {'.', 9, 8, '.', '.', '.', '.', 6, '.'}, {8, '.', '.', '.', 6, '.', '.', '.', 3}, {4, '.', '.', 8, '.', 3, '.', '.', 1}, {7, '.', '.', '.', 2, '.', '.', '.', 6}, {'.', 6, '.', '.', '.', '.', 2, 8, '.'}, {'.', '.', '.', 4, 1, 9, '.', '.', 5}, {'.', '.', '.', '.', 8, '.', '.', 7, 9}};
        boolean ret = isValidSudoku(board);

        //旋转图像

    }

    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet setLine = new HashSet();
            HashSet setCol = new HashSet();
            HashSet setBox = new HashSet();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !setLine.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !setCol.add(board[j][i])) {
                    return false;
                }
                //三成三方格
                int a = (i / 3) * 3 + j / 3;
                int b = (i % 3) * 3 + j % 3;

                if (board[a][b] != '.' && !setBox.add(board[a][b])) {
                    return false;
                }
            }
        }
        return true;

    }

    private static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int index = 0;
        int[] sumrsp = new int[2];
        for (int i = 0; i < length; i++) {
            if (i == index) {
                continue;
            }
            if (nums[i] + nums[index] == target) {
                sumrsp[0] = i;
                sumrsp[1] = index;
                Arrays.sort(sumrsp);
                return sumrsp;
            }
            if (i == length - 1) {
                i = 0;
                index++;
            }

        }
        return sumrsp;

    }

    private static void moveZeroes(int[] nums) {
        int length = nums.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));

    }

    private static int[] SolutionAdd1(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                //如果数组当前元素不等于9，直接加1
                //然后直接返回
                digits[i]++;
                return digits;
            } else {
                //如果数组当前元素等于9，那么加1之后
                //肯定会变为0，我们先让他变为0
                digits[i] = 0;
            }
        }
        //除非数组中的元素都是9，否则不会走到这一步，
        //如果数组的元素都是9，我们只需要把数组的长度
        //增加1，并且把数组的第一个元素置为1即可
        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;

    }

    private static int[] solution(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ints = new int[list.size()];
        int index = 0;
        for (int i1 = 0; i1 < list.size(); i1++) {
            ints[index++] = list.get(i1);
        }
        return ints;

    }

    //存在重复元素
    private static boolean repeat(int[] nums) {
        //进行数组排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    //存在重复元素 使用set集合
    private static boolean repeat1(int[] nums) {
        //创一个set集合
        Set<Integer> set = new HashSet<>();
        //我们知道set集合中的元素是不能有重复的，在添加的时候如果有重复的，会把之前的值给覆盖，并且返回false。我们遍历数组中的所有值，一个个添加到集合set中，在添加的时候如果返回false，就表示有重复的，直接返回true。
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static int singleNumber(int[] nums) {
        int reduce = 0;
        for (int num : nums) {
            reduce = reduce ^ num;
        }

        return reduce;
    }

}
