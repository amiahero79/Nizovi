package bozovic.milos;

import java.util.Scanner;

public class Vezba16 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
	    x[i] = sc.nextInt();
	}
	int suma = 0;
	for(int i = 0; i< n; i++) {
		
		if(x[i]%5 == 0) {
			suma += x[i];
			System.out.print(x[i] + " ");
		System.out.println();
		}
	}
	System.out.println("Suma iznosi " + suma);
	}

}
