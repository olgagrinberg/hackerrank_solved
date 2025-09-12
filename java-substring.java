//https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        in.close();
        
        // Extract substring from start to end (inclusive)
        // substring(start, end+1) because substring's end parameter is exclusive
        String result = S.substring(start, end);
        System.out.println(result);
    }
}
