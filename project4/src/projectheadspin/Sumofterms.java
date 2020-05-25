package projectheadspin;

import java.util.Scanner;

public class Sumofterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		double sum=0;
	for(i=1;i<=n;i++) {	
		
		double k=Math.pow(((2*i)-1), 2)/Math.pow(((2*i)-1), 3);
				
			/*
			 * (1/((2*i)-1));
			 */		
		sum=sum+k;
		
	}
		System.out.println(sum);
	
	}

}
