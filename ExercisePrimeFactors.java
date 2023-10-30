package exercise_primefactors;
import java.io.*;
public class ExercisePrimeFactors {
    
    public static void main (String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int inputNum, pIndex, nIndex, ctr;
    	int intArray[];
    	
    	System.out.println("Enter a number: ");
    	inputNum = Integer.parseInt(bf.readLine());
    	intArray = new int [inputNum];
    	
    	for (int i = 0; i < inputNum; i++){
            intArray[i] = i+1; 
        }
        pIndex = 2; 
        nIndex = 2;
        
        while ((pIndex*nIndex)-1 < inputNum){
            //loop until the max value(input number) is not yet reached    
            while ((pIndex*nIndex)-1 < inputNum){            
                intArray[(pIndex*nIndex)-1] = 0;
                nIndex++;
            }
            nIndex=1;
            //get next value for pIndex..element that is not yet set to 0
            for(int j=(pIndex*nIndex); j<inputNum; j++){
                if (intArray[j] != 0){
                    pIndex = intArray[j];
                    break;
                }
            }
            nIndex++;
        }
            
       
            
    	System.out.println("The following numbers are the prime numbers from 1 to " + inputNum);
    	for (int k = 0; k< inputNum; k++){
            if (intArray[k] != 0)
                System.out.println(intArray[k]);   			
    	}	
    }    
}