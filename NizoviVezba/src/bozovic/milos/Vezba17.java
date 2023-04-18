package bozovic.milos;

import java.util.Scanner;

public class Vezba17 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza x: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
		
	}
	int max;
	max = x[0];
	int maxb = 0;
	for(int i = 1; i < n; i++) {
		if(max < x[i])
			max = x[i];
	        maxb = i++;
		
	}
	System.out.println("Najveći član niza je: " + max + " , a njegov redni broj je "+ maxb);	
		
		
	}

}
