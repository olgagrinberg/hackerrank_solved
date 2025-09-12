//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

//Write your code here
    static int B;
    static int H;
    static boolean flag;
    
    static {
        Scanner scanner = new Scanner(System.in);
        try {
            B = scanner.nextInt();
            H = scanner.nextInt();
            
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

