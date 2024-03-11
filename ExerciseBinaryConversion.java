package exericse_binaryconversion;
import java.io.*;

public class ExerciseBinaryConversion {
    
    public static void main(String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	int inputNumber,answer;
    	String binaryConversion;
    		
    	System.out.println("Enter the number to be converted in binary:");
    	inputNumber = Integer.parseInt(bf.readLine());
    	
    	binaryConversion = "";
    	while(inputNumber>=1){
            answer = inputNumber%2;
            binaryConversion = Integer.toString(answer) + binaryConversion;
            inputNumber = inputNumber/2;
    	}
    	System.out.println("The binary conversion of this number is: " + binaryConversion);	
    }   
}
