package exercise_numberlist;

 public class NumberList {
    public static void main(String[] args){
        int numRows, numTabs, numOutput,numStart, numCtr;
        numRows = 23;
        numTabs = 27;
        numOutput = 1;
        numStart = 1;
        numCtr = 1;
        
        // Prints the blank spaces
        while( numStart <= numRows){
            for (int j = 0; j < numTabs; j++){
                System.out.print(" ");
            }
        	
            // Prints the value of the number
            while( numCtr <= numStart){        		   
                if (numOutput == 1){
                    System.out.print(numOutput + "  ");
                    numOutput++;
                    numCtr++;
                }

                else {
                    if (numCtr <= (numStart-1)/2){
                        if (numOutput > 99){
                            System.out.print(numOutput + "");
                        }

                        else if (numOutput> 9){
                            System.out.print(numOutput + " ");
                        }

                        else {
                            System.out.print(numOutput + "  ");
                        }

                        numOutput = numOutput*2; 
                        numCtr++;
                    }

                    else{
                        if (numOutput > 99){
                            System.out.print(numOutput + "");
                        }

                        else if (numOutput > 9){
                            System.out.print(numOutput + " ");
                        }

                        else {
                            System.out.print(numOutput + "  ");
                        }

                       numOutput = numOutput/2; 
                       numCtr++;   
                   }
                }
            }
            System.out.println();
            numOutput = 1;
            numCtr = 1;
            numStart = numStart + 2;
            numTabs = numTabs - 3;
            numRows = numRows - 1;
        }
    }
 }
 