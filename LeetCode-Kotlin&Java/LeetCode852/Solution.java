package LeetCode852;

/* 852. Peak Index in a Mountain Array */
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int left=0;
      int right=arr.length-1;
      while (left<right){
          int mid=(left+right)/2;
          if(arr[mid]<arr[mid+1]) left=mid+1;
          else right=mid;
      }
      return left;
    }
}
