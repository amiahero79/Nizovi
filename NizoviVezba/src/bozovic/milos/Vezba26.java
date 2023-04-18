package bozovic.milos;

import java.util.Scanner;

public class Vezba26 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj redova matrice: ");
	int red = sc.nextInt();
	System.out.println("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int a[][] = new int [red][kolona];
	
	System.out.println("Unesite elemente matrice: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("a[" + i + "," + j + "] = ");
			a[i][j] = sc.nextInt();
		}
	}
	int max = a[0][0];
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			if(max < a[i][j] )
				max = a[i][j];
	}
	}
	System.out.print("Najveći element matrice je: " +max);	
		
		
	}

}
