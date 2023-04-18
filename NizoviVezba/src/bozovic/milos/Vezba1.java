package bozovic.milos;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj niza n: ");
	int n = sc.nextInt();
	
	
	System.out.println("Unesite elementa niza x: ");
	int x [] = new int [n];
		
	
	for(int i = 0; i < n; i++) {
		System.out.print("[" + i + "] = ");
		 x[i] = sc.nextInt();
	}


	for(int i = 0; i < n; i++) 
		System.out.print(x[i] + " ");
	sc.close();
	}

}
