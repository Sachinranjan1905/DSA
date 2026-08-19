/*
 * Merge Sorted Array
 * ------------------
 * Merges two sorted arrays into nums1 in non-decreasing order.
 *
 * nums1 has enough extra space at the end to store all elements
 * of nums2. The merge is performed in-place without using an
 * additional array.
 *
 * Approach:
 * - Start from the last valid element of nums1 and nums2.
 * - Compare both elements from right to left.
 * - Place the larger element at the end of nums1.
 * - Continue until all elements of nums2 are merged.
 *
 * Using three pointers:
 * i -> last valid element of nums1
 * j -> last element of nums2
 * k -> position where the next largest element is placed
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else if(nums1[i] <nums2[j]){
                nums1[k--]=nums2[j--];
            }
            else{
                nums1[k--]=nums1[i--];
                nums1[k--]=nums2[j--];
            }
        }
        
        if(j>=0){
            while(j>=0){
            nums1[k--]=nums2[j--];
            }
        }
        
    }
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        obj.merge(nums1,m,nums2,n);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
