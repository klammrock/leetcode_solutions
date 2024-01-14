package name.klamm.leetcode_top_150_88_merge.sorted.array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Pos = m - 1;
        int nums2Pos = n - 1;
        int nums1InsertPos = m + n - 1;

        while (nums1InsertPos >= 0) {
            int num1 = (nums1Pos >= 0) ? nums1[nums1Pos] : Integer.MIN_VALUE;
            int num2 = (nums2Pos >= 0) ? nums2[nums2Pos] : Integer.MIN_VALUE;

            if (num1 > num2) {
                nums1[nums1InsertPos--] = num1;
                --nums1Pos;
            } else {
                nums1[nums1InsertPos--] = num2;
                --nums2Pos;
            }
        }
    }
}

public class Leetcode_top_150_88_mergeSortedArray {
    public static void main(String[] args) {
    }
}
