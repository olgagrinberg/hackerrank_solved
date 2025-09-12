//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

mport java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
         // Remove case sensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths differ, no need to check further
        if (a.length() != b.length()) return false;

        // Convert strings to char arrays and sort them
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);

        // Compare sorted arrays
        return java.util.Arrays.equals(aArr, bArr);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
