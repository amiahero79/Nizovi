package bozovic.milos;

import java.util.Scanner;

public class Vezba22 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj redova matrice: ");
	int red = sc.nextInt();
	
	System.out.print("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int [][] a = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("a[" + i + ", " + j + "] = ");
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Elementi matrice a su: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print(a[i][j] + " ");
		}
		System.out.println();
	}
		
	System.out.println("Elementi druge kolone: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			if(j == 1)
			System.out.print(a[i][j] + " ");
		}
		
	}
		
	
		sc.close();
		
	}

}
