package projectheadspin;

import java.util.Arrays;
import java.util.Scanner;

public class Reversewords { 
	  
    public static void main(String[] args) 
    { 
    	Scanner sc = new Scanner(System.in);
    	String s= sc.nextLine();
    	String[] s2=s.split("[.]");
    
    	
    	System.out.println(Arrays.toString(s2));

    	
        String ans = ""; 
        for (int i = s2.length - 1; i >= 0; i--) { 
            ans += s2[i] + " "; 
        } 
        System.out.println(ans.substring(0, ans.length() - 1)); 
    } 
} 
