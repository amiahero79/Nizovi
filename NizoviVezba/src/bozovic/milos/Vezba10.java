package bozovic.milos;



public class Vezba10 {

	public static void main(String[] args) {

	
		
	int k [] = {25, 31, 12, -7, 24, 121, -35, 42, 15};
	int k2 [] = new int [20];
	int k5 [] = new int [20];
	int n2 = 0;
	int n5 = 0;
	
	for(int i = 0; i < 10; i++) {
		if(k[i] % 2 == 0) {
			n2++;
			k[n2] = k[i];
		}
		if(k[i]%5 == 0) {
			n5++;
			k[n5] = k[i];
			
		}	
	}
		for(int i = 0; i < n2; i++) {
			System.out.print(k2[i] + " ");
		}
			for(int i = 0; i < n5; i++) {
				System.out.print(k5[i] + " ");	
			
		}
			
			
			
		
		
		
		
		}
			
		
		
	
		
	}


