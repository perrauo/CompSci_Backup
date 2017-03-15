import java.io.*;

/**
 * TestBankAccounts.java:
 *  This class will test aspects of inheritance for the BankAccount class
 *  and its subclasses.
 * @author CS027b 2007
 */

public class TestBankAccounts {
    
    public static void main(String[] args) {
      
        BankAccount bacc0 = new BankAccount(0);
        System.out.println(bacc0.toString());
        
        BankAccount bacc1 = new BankAccount(5000);
        System.out.println(bacc1.toString());
        
        CheckingAccount chacc1 = new CheckingAccount(500.0);
        System.out.println(chacc1.toString());
                          
        SavingsAccount sacc1 = new SavingsAccount(1000.0, 1.0);
        System.out.println(sacc1.toString()); 
        
        //-------------------------------------------------------
        // add your code here
        
        bacc0 = chacc1;  //This is legal because chacc1 is a banking accout 
        
        
        System.out.println("LAST TOSTRING");
        System.out.println(bacc0.toString()); //it use the toString of 
        
        // Add a statement to make the variable chacc1 reference 
        //the BankAccount object referenced by bacc1
        
        //CheckingAccount tempacc = (CheckingAccount) bacc1;
        //chacc1 = tempacc; //downCasting bacc1 //All checking account are bank account but not all bankaccount are checking account
        
        //upcasting is legal because BankAccount is initialized as a checking account
        BankAccount bacc2 = new CheckingAccount(200.0);
        chacc1 = (CheckingAccount) bacc2;
        
        //Deducting fees
        //bacc1.deductFees();
        chacc1.deductFees(); //only this class posess the method
        //sacc1.deductFees();
        
        chacc1.deposit(100.0); //deposit 100.0
        
        
        
    }
    
}



///dynamic binding//
// Binding simply refers to link between method definition and
//method call. Actual objects are used during run time for
//binding. Dynamic binding enables developers to interface new
//code sequences and objects with a system without altering the 
//existing code thus eliminating switch statements. Method overriding
//is a good example of dynamic binding.




