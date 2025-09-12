// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); // Number of lines
        List<List<Integer>> list = new ArrayList<>();

        // Read n lines of input
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); // Number of integers in this line
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                innerList.add(scan.nextInt());
            }
            list.add(innerList);
        }

        int q = scan.nextInt(); // Number of queries

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); // Line number
            int y = scan.nextInt(); // Position in line

            // Try to access the element, handle errors gracefully
            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

        scan.close();

    }
}
