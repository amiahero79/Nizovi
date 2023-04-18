package bozovic.milos;

import java.util.Scanner;

public class Vezba14 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
    System.out.println("Unesite koliko ima brojeva zgrada u ulici n: ");
    int n = sc.nextInt();
    
    int x [] = new int [n];
    int par [] = new int [n];
    int nepar [] = new int [n];
    
    for(int i = 0; i < n; i++) {
    	System.out.print("x[" + i + "] = ");
    	x[i] = sc.nextInt();
    }
    int parb = 0;
    int neparb = 0;
    for(int i = 0; i < n; i++) {
    	if( x[i]% 2 == 0) {
    		parb ++;
    		par[parb] = x[i];
    		
    		
    	}
    	else {
    		neparb ++;
    		nepar[neparb] = x[i];
    		
    	}	
    }
    System.out.print("Spisak svih brojeva u ulici je: ");
    for(int i = 0; i < n; i++)
    	System.out.print(x[i] + " ");
    System.out.println();
    System.out.print("Spisak svih parnih brojeva u ulici je: ");
    for(int i = 1; i <=parb; i++)
    	System.out.print(par[i] + " ");
    System.out.println();
    System.out.print("Spisak svih neparnih brojeva u ulici je: ");
    for(int i = 1; i <=neparb; i++)
    	System.out.print(nepar[i] + " ");
		
	}

}
