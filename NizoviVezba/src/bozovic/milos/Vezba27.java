package bozovic.milos;

import java.util.Scanner;

public class Vezba27 {

	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj redova matrice: ");
	int red = sc.nextInt();
	
	System.out.println("Unesite broj kolona matrice: ");
	int kolona = sc.nextInt();
	
	int [][] a = new int [red][kolona];
	
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			System.out.println("a[" + i + "," + j + "] = ");
			a[i][j] = sc.nextInt();
		}
	}
	for(int i = 0; i < red; i++) {
		for(int j = 0; j < kolona; j++) {
			if((i+j+1) == red)
				System.out.print(a[i][j] + " " );
		}
	} 
	
		
		
	}

}
