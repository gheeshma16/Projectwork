package projectheadspin;

import java.util.Scanner;

public class Armstrongnumbers 
{ 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,p,rev,i,l;
	String str;
	double s=0;
	n=sc.nextInt();
	for(i=0;i<=n;i++) {
		p=i;
		 str = Integer.toString(i);
		l=str.length();
		while(p>0) {
			rev=p%10;
			s=s+Math.pow(rev, l);
			p=p/10;
		}
	if(s==i)	{
		System.out.println(p);
	}
	
		s=0;
		
	}
	
	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
}}