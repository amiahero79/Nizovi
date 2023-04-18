package bozovic.milos;

import java.util.Scanner;

public class Vezba12 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x [] = new int [n];
	
	System.out.println("Unesite elemente niza x: ");
	for(int i = 0; i < n; i++) {
		System.out.println("x[" + i + "] = ");
		x[i] = sc.nextInt();
	}
	int cifra;
	for(int i = 0; i < n; i++) {
	int max = 0;	
	int	a = x[i];
		while(a != 0) {
			cifra = a %10;
			if(max < cifra)
				max = cifra;
			
			a /=10;
		}
	System.out.println("Najveća cifra člana " + x[i] + " je " + max);	
		
	}
		sc.close();

	}

}
