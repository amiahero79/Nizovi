package bozovic.milos;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	
	for(int i = 0; i < x.length; i++) {
		
		System.out.println("x[" + i + "]= ");
		x[i] = sc.nextInt();
	}
	for(int i = 1; i < x.length; i++)
		if((x[i-1]+x[i])%2 ==0)
			System.out.println(x[i-1] + " " + x[i]);
	sc.close();
	}

}
