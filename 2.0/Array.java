import java.util.*;

public class Array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getMinNumber(int numbers[]) {
        int minimum = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int BinarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) { // FOUND
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1; // Right
            } else { // Left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void ReveseArray(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void PairsinArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();

        }
    }

    public static void PrintSubArraay(int numbers[]) {

        int ts = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            System.out.println("Total SubArray: " + ts);
        }
    }

    public static void MaxSubArraySum(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // print Subarray Sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void MaxSubArraySumPrefix(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // calculate prefix array

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    // Kadane's Algorithms

    public static void Kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE; // Max Sum = ms
        int cs = 0; // Current Sum = cs

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max Subarray sum is : " + ms);
    }

    // Trapped RainWater

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        if (n <= 2)
            return 0; // Edge case where less than 3 elements cannot trap any water

        // Calculate Left Boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate Right Boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // Loop to calculate the trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
    }
}