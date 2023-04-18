package bozovic.milos;

import java.util.Scanner;

public class Vezba20 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	System.out.print("Broj redova: ");
	int red = sc.nextInt();
	System.out.print("BRoj kolona: ");
	int kolona = sc.nextInt();
	
	int niz [][] = new int [red][kolona];
	
	System.out.println("Elementi matrice: ");
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print("niz[" + i + ", " + j + "] = ");
			niz[i][j] = sc.nextInt();
		}
		
	}
	System.out.println("Ispisivanje elemenata" );
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print(niz[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println("Ispisivanje elemenata zamenom reda sa kolonom" );
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.print(niz[j][i] + " ");
		}
		System.out.println();
	}
		sc.close();
		
		
		
	}

}
