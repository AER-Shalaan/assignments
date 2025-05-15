package week2;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getArrayInput();
        System.out.println("Summation of its elements = " + getSummation(arr));
        System.out.println("The number of its elements = " + getNumOfElements(arr));
        System.out.println("The max value in the array = " + getMax(arr));
        System.out.println("The min value in the array = " + getMin(arr));
        System.out.println("Sum of even numbers = " + calculateEven(arr)[0] + " and how many even numbers = " + calculateEven(arr)[1]);
        System.out.println("Counts occurrences of number 2 = " + countOccurrences(arr, 2));
        System.out.println("Count occurrences of every number in the array: ");
        countGeneral(arr);
        selectionSort(arr);
        System.out.println("Sorting array by selection sort: ");
        readArray(arr);
        System.out.println("***********************************************");
        System.out.println("Enter number to search for its existence and location:");
        int target = input.nextInt();
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Number " + target + " found at index: " + index);
        } else {
            System.out.println("Number " + target + " not found.");
        }
    }

    static int[] getArrayInput() {
        System.out.println("Enter the length of your array:");
        int[] arr = new int[input.nextInt()];
        System.out.println("Enter " + arr.length + " numbers to fill the Array:");
        writeInArr(arr);
        return arr;
    }

    static void writeInArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    static void readArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        System.out.println("]");
    }

    static int getSummation(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int getNumOfElements(int[] arr) {
        return arr.length;
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] getEvensNums(int[] arr) {
        int countOfEvensNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countOfEvensNums++;
            }
        }

        int[] evensNums = new int[countOfEvensNums];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evensNums[index++] = arr[i];
            }
        }
        return evensNums;
    }

    static int[] calculateEven(int[] arr) {
        int[] evens = getEvensNums(arr);
        int[] evensInfo = new int[2];
        evensInfo[0] = getSummation(evens);
        evensInfo[1] = getNumOfElements(evens);
        return evensInfo;
    }

    static int countOccurrences(int[] arr, int number) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

    static void countGeneral(int[] arr) {
        boolean[] counted = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static int binarySearch(int[] arr, int target) {
        selectionSort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
