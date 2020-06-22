package dataStructure.Arrays;
/*
problem statement: Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store the first d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]
 */
public class ArrayRotation {
    public static void main(String[] args ){
        int[] input ={1,2,3,4,5,6,7};
        int d=2;
        int n = input.length;
        int[] output=rotate(input, d, n);
        for(int i=0;i<output.length;i++){
            System.out.println(output[i]);
        }
    }

    public static int[] rotate(int[] arr, int value, int length ) {
        int[] temp = new int[value];
        for (int i = 0; i < value; i++) {
            temp[i] = arr[i];
        }
        System.out.println(temp.toString());
        for (int i = 0, j = value; j < length; i++, j++) {
            arr[i] = arr[j];
        }
        System.out.println(arr.toString());
        for (int i = length - value, j = 0; i < length; i++, j++) {
            arr[i] = temp[j];
        }
        return arr;
    }
}
