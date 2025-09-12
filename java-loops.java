//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0; j<n; j++) {
                int sum = a;
                for (int k=0; k<=j; k++) {
                    sum +=Math.pow(2, k)*b;
                }
                System.out.printf("%d ",sum);
            }
            System.out.println();
        }
        in.close();
    }
} 
//0 2 10 //2 6 14 30 62 126 254 510 1022 2046
//5 3 5  //8 14 26 50 98
