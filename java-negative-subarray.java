// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        int count = 0;
        
        // Loop through all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);

    }
}
