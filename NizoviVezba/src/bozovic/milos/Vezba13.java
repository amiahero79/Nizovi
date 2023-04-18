package bozovic.milos;

import java.util.Scanner;

public class Vezba13 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	int y[] = new int [n];
	int z[] = new int [n];
	
	System.out.println("Unesite dužine stranica: ");
	for(int i = 0; i < n; i++) {
		System.out.print("x[" + i + "] = ");
		x[i] = sc.nextInt();
		System.out.print("y[" + i + "] = ");
		y[i] = sc.nextInt();
		System.out.print("z[" + i + "] = ");
		z[i] = sc.nextInt();
	}
	
	for(int i = 0; i <n; i++) {
		if((x[i]+y[i]>z[i])&&(x[i]+z[i]> y[i])&&(y[i]+z[i]>x[i]))
		System.out.println("Stranice " + x[i] + ", " + y[i] + ", " + z[i] + "čine trougao!");
		else
			System.out.println("Stranice " + x[i] + ", " + y[i] + ", " + z[i] + "ne čine trougao!");	
	}

	}

}
