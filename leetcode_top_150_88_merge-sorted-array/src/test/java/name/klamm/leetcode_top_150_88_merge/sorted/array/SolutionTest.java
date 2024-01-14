package name.klamm.leetcode_top_150_88_merge.sorted.array;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    private final Solution solution = new Solution();
    private int[] nums1;
    private int[] nums2;
    
    @Test
    public void testMerge() {
        nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        nums2 = new int[] { 2, 5, 6 };
        
        solution.merge(nums1, 3, nums2, 3);
        
        assertArrayEquals(new int[] { 1, 2, 2, 3, 5, 6 }, nums1);
    }
    
    @Test
    public void testMerge2() {
        nums1 = new int[] { 1 };
        nums2 = new int[] { };
        
        solution.merge(nums1, 1, nums2, 0);
        
        assertArrayEquals(new int[] { 1 }, nums1);
    }
    
    @Test
    public void testMerge3() {
        nums1 = new int[] { 0 };
        nums2 = new int[] { 1 };
        
        solution.merge(nums1, 0, nums2, 1);
        
        assertArrayEquals(new int[] { 1 }, nums1);
    }
    
    @Test
    public void testMerge4() {
        nums1 = new int[] { 1, 3, 5, 7, 0, 0, 0 };
        nums2 = new int[] { 2, 4, 6 };
        
        solution.merge(nums1, 4, nums2, 3);
        
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, nums1);
    }
    
    @Test
    public void testMerge5() {
        nums1 = new int[] { 1, 2, 3, 0, 0, 0, 0 };
        nums2 = new int[] { 4, 5, 6, 7 };
        
        solution.merge(nums1, 3, nums2, 4);
        
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7 }, nums1);
    }
}
