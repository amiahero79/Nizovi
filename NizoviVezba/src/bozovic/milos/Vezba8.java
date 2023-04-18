package bozovic.milos;

import java.util.Scanner;

public class Vezba8 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	System.out.println("Unesite elemente članova niza x: ");
	
	for(int i = 0; i < n; i++) {
	System.out.println("x[" + i + "] = ");
	x[i] = sc.nextInt();
		
	}
	double y;
	for(int i = 0; i < n; i++) {
		if(x[i] % 2 == 0) {
			y = (double)1/x[i];
			
	}else
		y = x[i]*x[i];
		System.out.println("Za neparan član niza nova vrednost je: " + y);	
	}
		
		

	}

}
