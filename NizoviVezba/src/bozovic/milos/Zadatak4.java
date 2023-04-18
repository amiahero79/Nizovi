package bozovic.milos;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Unesite broj članova niza n: ");
	int n = sc.nextInt();
	
	int x[] = new int [n];
	System.out.println("Unesite članove niza");
	for(int i = 0; i < x.length; i++) {
		System.out.println("x[" + i +"] =");
		 x[i] = sc.nextInt();
	}
	int p = 1;
    for(int i = 0; i < x.length; i++) {
    	if(x[i]%4 != 0) {
    		p *=x[i];
    	}
    	
    }
    System.out.println(p);
    sc.close();
	}

}
