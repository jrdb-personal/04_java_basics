package exercise_codecipher;
import java.io.*;

public class ExerciseCodeCipher {
    
    public static void main(String args[]) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	
    	int k, length,ascValue, ctr;
    	String message, convertedMessage;
    	int strMessage[];
    	char strConverted[];
    	char letters;
    	
    	System.out.println("Enter the cipher key:");
    	k = Integer.parseInt(bf.readLine());
    	
    	System.out.println("Enter the code to be cipher:");
    	message = bf.readLine();
    	
    	length = message.length();
    	strMessage = new int[length];
    	strConverted = new char[length];
    	
    	for (int h = 0; h<length; h++){
            ascValue = message.charAt(h);
            strMessage[h] = ascValue;
    	}
    	
    	ctr= 0;
    	for (int i  = 0; i<length; i++){
            ascValue = strMessage[i] - k;
            if (ascValue <65){
                ascValue = 91 - (k - ctr);
                letters = (char)ascValue;
                strConverted[i] = letters;
                ctr++;
            }

            else{
                    letters = (char)ascValue;
                    strConverted[i] = letters;
            }
    	}
    	
    	convertedMessage = "";
    	for (int i = 0; i<length; i++){
            convertedMessage = convertedMessage + strConverted[i];
    	}
        
    	System.out.println("The true meaning of the message is: " + convertedMessage);
    }
}