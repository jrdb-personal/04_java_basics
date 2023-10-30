package edu.itdc.training.exercise;
import edu.itdc.training.banking.*;
import java.io.*;
import java.util.ArrayList;


public class TestBank {

    public static void main (String args[]) throws IOException{
        
        //declare required variables
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int acctTrans;
        String accountNo;
        String accountName;
        String accountType;
        double initBalance;
        double interestRate;
        double overdraftRate;
        String tranType;
        double deposit;
        double amount;
        
        ArrayList <SavingsAccount> lstSavingsAccount = new ArrayList<>();
        ArrayList <CheckingAccount> lstCheckingAccount = new ArrayList<>();
        
        //ask number of transaction from user and use it for iterations of asking user inputs
        System.out.println(">>Enter the number of New Accounts Transactions");
                
        //get input and parse it into number
        acctTrans = Integer.parseInt(bf.readLine());
        
        //create a loop of iterations to request for account details
        for (int i=1; i<=acctTrans; i++){
            //request for user input
            //and save to temporary variables
            System.out.println("Enter account information " + i);
            System.out.println("Account Number: ");
            accountNo = bf.readLine();
            System.out.println("Account Name: ");
            accountName = bf.readLine();
            System.out.println("Account Type S for Savings, C for Checking: ");
            accountType = bf.readLine();
            System.out.println("Initial Balance: ");
            initBalance = Double.parseDouble(bf.readLine());
            
            //do the following if account type is Savings
            if ("S".equalsIgnoreCase(accountType)){
                System.out.println("Interest Rate: ");
                interestRate = Double.parseDouble(bf.readLine());
                //create new object
                SavingsAccount objSavings = new SavingsAccount(accountNo, accountName, initBalance, interestRate);
                //add this object to the list
                lstSavingsAccount.add(objSavings);
            }
            
            //do the follwoing if account type is Checking
            else {
                System.out.println("Over Draft Rate: ");
                overdraftRate = Double.parseDouble(bf.readLine());
                //create new object
                CheckingAccount objChecking = new CheckingAccount(accountNo, accountName, initBalance, overdraftRate);
                //add this object to the list
                lstCheckingAccount.add(objChecking);
            }
            
            //print extra line
            System.out.println();
        }
        
        //ask number of regular transaction for created users
        System.out.println(">> Enter number of regular transactions: ");
                
        //get input and parse it into number
        acctTrans = Integer.parseInt(bf.readLine());
        
        //create another loop for regular transactions
        for(int i=1; i<=acctTrans; i++){
            //request for user input
            //and save to temporary variables
            System.out.println(" Enter transaction: " + i);
            System.out.println("Account Number: ");
            accountNo = bf.readLine();
            System.out.println("Transaction Type (D for deposit, W for Withdrawal):");
            tranType = bf.readLine();
            
            //do the following if transaction type is Deposit
            if ("D".equalsIgnoreCase(tranType)){
                System.out.println("Deposit: ");
                deposit = Double.parseDouble(bf.readLine());
                //access the existing user
                for (int j=0; j< lstSavingsAccount.size(); j++) {
                    //if found then call function for deposit then display success
                    if ((lstSavingsAccount.get(j).getAccountNo().equalsIgnoreCase(accountNo)) && (lstSavingsAccount.get(j).deposit(deposit))){
                        System.out.println("Deposit for account [" + lstSavingsAccount.get(j).getAccountName() + "] successful.");
                        System.out.println("Current Balance: " + lstSavingsAccount.get(j).getBalance());
                    }
                    
                    //if not found or deposit function returns false display failed
                    else {
                        System.out.println("Deposit for account " + accountNo + "failed!");
                    }  
                }
            }
            
            //if transaction is withdraw
            else {
                System.out.println("Withdraw: ");
                amount = Double.parseDouble(bf.readLine());
                //access the existing user
                for (int j=0; j< lstCheckingAccount.size(); j++) {
                    //if found, call function for deposit then display success
                    if ((lstCheckingAccount.get(j).getAccountNo().equalsIgnoreCase(accountNo)) && (lstCheckingAccount.get(j).withdraw(amount))){
                        System.out.println("Withdraw for account [" + lstCheckingAccount.get(j).getAccountName() + "] successful.");
                        System.out.println("Current Balance: " + lstCheckingAccount.get(j).getBalance());
                    }
                    
                    //if not display failed
                    else {
                        System.out.println("Deposit for account " + accountNo + "failed!");
                    }
                    
                }                        
            }
        }
    }
}
