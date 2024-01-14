package name.klamm.leetcode_top_150_88_merge.sorted.array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = m + n - 1; i >= 0; --i, --j ) {
            nums1[j] = nums1[i];
        }
        
        int nums1Pos = n;
        int nums2Pos = 0;
        int nums1InsertPos = 0;

        while (nums1InsertPos < m + n) {
            int num1 = (nums1Pos < m + n) ? nums1[nums1Pos] : Integer.MAX_VALUE;
            int num2 = (nums2Pos < n) ? nums2[nums2Pos] : Integer.MAX_VALUE;
            
            if (num1 > num2) {
                nums1[nums1InsertPos++] = num2;
                ++nums2Pos;
            } else {
                nums1[nums1InsertPos++] = num1;
                ++nums1Pos;
            }
        }
    }
}

public class Leetcode_top_150_88_mergeSortedArray {

    public static void main(String[] args) {
    }
}
