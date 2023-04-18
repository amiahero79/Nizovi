package bozovic.milos;

import java.util.Scanner;

public class Vezba11 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	System.out.println("Unesite elementa niza x: ");
	
	for(int i = 0; i < n ; i++) {
		System.out.println("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}	
	int max, min;
	max = min = x[0];
	for(int i = 0; i < n; i++) {
		
	if(max < x[i] )
			max = x[i];
		if(min > x[i])
			min = x[i];
	}
	System.out.println(min + ", " + max);
	
	sc.close();
	}
		
	
		
		

	}


