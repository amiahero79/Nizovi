package bozovic.milos;

import java.util.Scanner;

public class Vezba7 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for (int i = 0; i < n; i++) {
		System.out.println("x[" + i + "] = ");
		x[i] = sc.nextInt();
		
	}
	int cifra;
	int s = 0;
	for(int i = 0; i < n; i++) {
	
	int a = x[i];
	cifra = a % 10;
	if (cifra == 5) {
		s += a;
	}
		
	
	}
	System.out.println("Suma svih elemenata koji se završavaju sa 5 je:" + s);	
	sc.close();
		
	}

}
