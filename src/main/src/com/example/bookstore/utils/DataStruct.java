package com.example.bookstore.utils;

import java.util.*;
public class DataStruct {
    static List<List<Integer>> res = new ArrayList<>();//装所有结果的集合
    static List<Integer> tmp = new ArrayList<>();//装一条路径的结果

    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        backtracking(nums);
        return res;
    }
    private static void backtracking(int[] nums) {
        if (tmp.size() == nums.length) { //当单条路径的长度达到数组长度的时候，说明该路径已经完成
            res.add(new ArrayList<>(tmp));//将该结果集合加入到总结果集合中
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(nums[i]))//遇到使用过的数字就跳过
                continue;
            tmp.add(nums[i]);//将数组的数字加入到单条结果集合中
            backtracking(nums);//递归
            tmp.remove(tmp.size() - 1);//回溯到上一层
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[]{12,6,5};
        List<List<Integer>> list = permute(arr1);
        System.out.println(list);
        int[] weight = new int[]{0, 20, 30, 60, 40, 40};
        int first_load_weight = 100;
        int second_load_weight = 100;
    }
}