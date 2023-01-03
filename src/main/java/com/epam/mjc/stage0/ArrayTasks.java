package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numberArray = new int[length];
        int i =1;
        while(i<=length){
            numberArray[i-1] =i;
            i++;
        }

        return numberArray;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i<=arr.length-1; i++){
            sum =  sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int num = 0;
        for(int i =0; i<= arr.length-1; i++){
            if(number == arr[i]){
                num = i;
                break;
            }
            num = -1;
        }

        return num;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reverse = new String[arr.length];
        for(int i = 0; i <= arr.length-1; i++){
            reverse[i] = arr[(arr.length-1)-i];
        }

    return reverse;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int positives = 0;
        for (int a = 0; a<= arr.length-1; a++){
            if(arr[a]>0){
                positives++;
            }
        }
        int[] positiveArray = new int[positives];
        int positiveNumbers = 0;
        for(int i = 0; i <= arr.length-1; i++){
            if(arr[i]>0) {
                positiveArray[positiveNumbers] = arr[i];
                positiveNumbers++;
            }

        }
        return positiveArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] sortedArrays = new int[arr.length][];
        for(int i =0; i<= arr.length-1; i++){
            int[]sortedArray = new int[arr[i].length];
            for(int b = 0; b <=arr[i].length-1; b++){
                int sortID =0;
                for(int x=0; x<=arr[i].length-1; x++){
                    if(arr[i][b]>arr[i][x]){
                        sortID++;
                    }
                }
                sortedArray[sortID] = arr[i][b];
            }
            for(int a = 0; a<= arr.length-1;a++){
                int id = 0;
                if(arr[i].length> arr[a].length){
                    id++;
                }
                sortedArrays[id] = sortedArray;
            }
        }
        return sortedArrays;
    }
}
