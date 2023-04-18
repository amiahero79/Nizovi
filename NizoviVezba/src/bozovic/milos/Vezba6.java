package bozovic.milos;

import java.util.Scanner;

public class Vezba6 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	
	//Deklarisanje broja članova niza
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	//Deklarisanje prostora za niz
	int x [] = new int [n];
	
	//Unos elemenata niza
	System.out.println("Unesite elemente niza x: ");
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
		
	}
	int cifra;
	for(int i = 0; i < n; i++) {
		int p = 1;
		int a = x[i];
		while(a != 0) {
			cifra = a % 10;
			p *= cifra;
			a /= 10;
		}
		System.out.println("Proizvod cifara člana niza " + x[i] + " je = " + p);	
		
	}
		sc.close();
		
		
		
		

	}

}
