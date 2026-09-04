package leetcode-java.Binary Search;

public class 0852_Find_Peak_Element {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
           
        }
        return left;
    }
}
