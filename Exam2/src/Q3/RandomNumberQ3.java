package Q3;

import java.util.Random;

public class RandomNumberQ3 {

	    public static void main(String args[]) 
	    {
	        Random rand = new Random();
	  
	        int a = rand.nextInt(100); 
	        int b = rand.nextInt(100);
	        int c = rand.nextInt(100); 
	        int d = rand.nextInt(100); 
	        int e = rand.nextInt(100); 
	        int f = rand.nextInt(100); 
	        int g = rand.nextInt(100); 
	        int h = rand.nextInt(100); 
	        int i = rand.nextInt(100);
	        int j = rand.nextInt(100);
	        
	        int sum = a + b + c + d + e + f + g + h + i + j;
	        
	        System.out.println("Random Numbers: "+a);
	        System.out.println("Random Numbers: "+b);
	        System.out.println("Random Numbers: "+c);
	        System.out.println("Random Numbers: "+d);
	        System.out.println("Random Numbers: "+e);
	        System.out.println("Random Numbers: "+f);
	        System.out.println("Random Numbers: "+g);
	        System.out.println("Random Numbers: "+h);
	        System.out.println("Random Numbers: "+i);
	        System.out.println("Random Numbers: "+j);
	        System.out.println("Random Number Total: "+ sum);
	    }
}