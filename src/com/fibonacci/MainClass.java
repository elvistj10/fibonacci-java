package com.fibonacci;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
	      Scanner scanner = new Scanner( System.in );
	      int a, b, n, hasil;
	      System.out.print( "Input : " );
	      a = scanner.nextInt();
	      b = scanner.nextInt();
	      n = scanner.nextInt();
	      
	      System.out.print("Output : ");
	      System.out.print(a + ", " + b);    
		  
			 for(int i = 2; i < n; ++i)    
			 {    
			  hasil = a + b;  
			  System.out.print(", " + hasil);    
			  a = b;    
			  b = hasil;    
			 }

	}

}