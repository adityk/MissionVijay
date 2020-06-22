package dataStructure.Arrays;
/*
problem statement: Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of
numbers which has the largest sum.
Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0

return max_so_far
 */
public class LargestSumContiguousSubarray {
    public static void main(String[] args){
        int[] input = {-2,-4,-7,-1,-9,-8,-14};
        int len  = input.length;
        int max = max_sum_subarray(input,len);
        System.out.println("maximum sum of subarray: "+ max);
    }
    public static int max_sum_subarray(int[] arr, int length){
        int max_sum = Integer.MIN_VALUE;
        int max_end = 0;
        for (int i=0; i<length; i++){
            max_end = max_end + arr[i];
            if(max_sum<max_end){
                max_sum = max_end;
            }
            if(max_end<0){
                max_end = 0;
            }
        }
        return max_sum;
    }

}
