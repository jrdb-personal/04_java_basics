package exercise_randomnumbers;
import java.util.Random;

public class RandomNumbers {
    
    public static void main(String[] args){
        
    	Random randomGenerator = new Random();
    	int intNumberOfItems, intNumberPerLine;
    	int[] intItems = new int[90];
    			
    	intNumberOfItems = randomGenerator.nextInt(11) + 10;
    	intNumberPerLine = randomGenerator.nextInt(6) + 5;
    	    	
    	for (int i=0; i<89; i++){
            intItems[i] = randomGenerator.nextInt(91) + 10;
    	}
    	
    	System.out.println("There are " + intNumberOfItems + " values in the list");
    	System.out.println(intNumberPerLine + " will be printed per line");
    	
    	int[] intRandomItems = new int[intNumberOfItems];
    	
        for (int x = 0; x < intNumberOfItems; x++){
            int y = randomGenerator.nextInt(90);
            intRandomItems[x] = intItems[y];
    	}
    	
    	int a,b;
    	a=0;
    	
        while (a < intRandomItems.length-1){
            for (b=0; b<intNumberPerLine; b++){
                if (a > intRandomItems.length-1)
                    break;
                else{
                    System.out.print(intRandomItems[a] + " ");
                    a++;
                }
            }
            System.out.println();
    	}
    } 
}
