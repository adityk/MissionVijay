package dataStructure.Arrays;
/*
problem statement: Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of
numbers which has the largest sum.

 */
public class LargestSumContiguousSubarray {
    public static void main(String[] args){
        int[] input = {2,-4,7,-3,-1,8,4};
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
