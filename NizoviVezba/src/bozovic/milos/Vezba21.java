package bozovic.milos;

import java.util.Scanner;

public class Vezba21 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj redova matrice: ");
    int red = sc.nextInt();
    
    System.out.println("Unesite broj kolona matrice: ");
    int kolona = sc.nextInt();
    
    int [][] a = new int [red][kolona];
    
    System.out.println("Unesite elemente dvodimenzionalnog niza: ");
    for(int i = 0; i < red; i++) {
    	for(int j = 0; j < kolona; j++) {
    		System.out.print("a[" + i + ", " + j + "] = ");
    		a[i][j] = sc.nextInt();
    	}
    }
    
    System.out.println("Elementi prvog reda su: ");
    for(int i = 0; i < red; i++) {
    	for(int j = 0; j < kolona; j++) {
    if(i == 0)
    	System.out.print(a[i][j] + " ");
    	}
    }
		
		sc.close();

	}

}
