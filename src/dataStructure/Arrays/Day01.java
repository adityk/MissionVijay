package dataStructure.Arrays;

public class Day01 {
    /**
     * We are going to start study datastructure Array for coding interview
     * An array is a collection of items stored at contiguous memory locations.
     * This makes it easier to calculate the position of each element by simply adding an offset to a base value,
     * i.e., the memory location of the first element of the array (generally denoted by the name of the array).
     *
     * Advantage of using Arrays
     * Arrays allow random access of elements. This makes accessing elements by position faster.
     * Arrays have better cache locality that can make a pretty big difference in performance.
     *
     */
    //to print matrix to particular position(x,y)
    public static void main(String[] args){
        int [][] array_test = {{1,2,3},{4,5,6},{7,8,9}};
        int start = 2;
        int end = 2;
        int sum;
        for (int i=0;i<start;i++){
            for(int j=0;j<array_test[i].length && !(i==start-1 && j==end) ;j++){
                System.out.println("value of i :" + i + "value of j:" + j);
                System.out.println(array_test[i][j]);

            }
        }
    }


}
