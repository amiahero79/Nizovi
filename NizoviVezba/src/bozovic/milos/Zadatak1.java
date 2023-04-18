package bozovic.milos;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
	Scanner ulaz = new Scanner(System.in);	
		
	//Unos dimenzije niza
		
		System.out.println("Unesite broj elemenata n niza x: ");
		int n = ulaz.nextInt();
		
	//Rezervisanje prostora za niz od n članova
		int x[] = new int[n];
		
		
    //Unos elemenata niza
		
		System.out.println("Unesite slemente niza x: ");
		for(int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] =");
            x[i] = ulaz.nextInt(); 			
		}
		
	// Štampanje članova niza
		for(int i = 0; i <x.length; i++)
			System.out.print(x[i] + " ");
		
		
ulaz.close();
	}

}
