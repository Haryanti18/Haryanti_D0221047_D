import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        String[] result = s.split("\\s");
        int n = result.length;
        System.out.println(n);
        for(String myString : result){
            System.out.println(myString);
        }
        scan.close();
        
    }
}
