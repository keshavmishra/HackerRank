// github.com/keshavmishra
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rA=new StringBuilder(A).reverse().toString();
       if(A.equals(rA)){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
        
    }
}




