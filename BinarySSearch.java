import java.util.*;


public class BinarySearch {

    public static int binarySearch(int[] array, int lo, int hi, int searchValue){

        int index = -1;
        int middle;

        //Base case where the lower index is higher than the high index representing you sorted all the array without founding the value by reaching a one element array:

        if(lo > hi){

            return -1;

        }

        middle = (lo + hi) / 2;

        if(searchValue == array[middle]){

            return middle;

        } else if(searchValue < array[middle]){

            index = binarySearch(array, lo, middle - 1, searchValue);

        } else if(searchValue > array[middle]){

            index = binarySearch(array, middle + 1, hi, searchValue);

        }

            return index;

        }

    public static void main(String args[])
    {
        int[] arr = { 10, 9, 1, 2, 3, 6 };

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int searchedNumberIndex = binarySearch(arr, 0, arr.length -1, 13);

        System.out.println(searchedNumberIndex);

    }
