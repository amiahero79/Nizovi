 package bozovic.milos;

public class Vezba18 {

	public static void main(String[] args) {
		
	int [] x = {25, 31, 12, -7, 14, 24, 121, -35, 42, 15};
	int [] x2 = new int [10];
	int [] x5 = new int [10];
	
	int br2 = 0;
	int br5 = 0;
	for(int i = 0; i < 10; i++) {
		if(x[i]%2 == 0) {
			x2[br2]= x[i];
            br2 ++;	
		}
	}
	for(int i = 0; i < 10; i++) {
		if(x[i]%5 == 0) {
			x5[br5]= x[i];
            br5 ++;	
		}
	}
    for(int i = 0; i<10; i++) {
    	System.out.print(x[i] + " ");
    }
    System.out.println();
    for(int i = 0; i<br2; i++) {
    	System.out.print(x2[i] + " ");
    }
    System.out.println();
    for(int i = 0; i<br5; i++) {
    	System.out.print(x5[i] + " ");
    }
    
    
	}

}
