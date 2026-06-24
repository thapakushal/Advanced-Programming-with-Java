
package rmi_string_operations;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;


public class rmiClient {
    public static void main(String[] args) throws Exception{
        // locate the registry 
        Registry rg = LocateRegistry.getRegistry("localhost",8008);
        
        // lookup the remote method (casting to get only remote method)
        RemoteMethods stub = (RemoteMethods)rg.lookup("skeleton");
        
        // call the method and print result 
//        int number = 5;
//        System.out.println("");

        // but we have to do here like this 
        // use switch case like this : 
        // -- Provided Services Are: --
        // 1. Change to lowerCase
        // 2. Change to upperCase
        // 3. Check Palindrome or NOT 
        // 4. Exit 
        // Enter your choice: 
        
        // scanner for userinput 
        Scanner sc = new Scanner(System.in);
        
        int choice;
        boolean running = true;
        
        while(running){
            // Display menue 
            System.out.println("\n==== Provided Services =====");
            System.out.println("1. Change to lowerCase");
            System.out.println("2. Change to upperCase");
            System.out.println("3. Check Palindrome or NOT");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consumes newline 
            
            switch(choice){
                case 1:
                    System.out.println("Enter string to Change to lowerCase: ");
                    String str1 = sc.nextLine();
                    String result1 = stub.toLower(str1);
                    System.out.println("Result: " + result1);
                    break;
                    
                case 2:
                    System.out.println("Enter string to Change to upperCase: ");
                    String str2 = sc.nextLine();
                    String result2 = stub.toUpper(str2);
                    System.out.println("Result:" + result2);
                    break;
                    
                case 3:
                    System.out.println("Enter String to Check Palindrome: ");
                    String str3 = sc.nextLine();
                    String result3 = stub.toPalindrome(str3);
                    System.out.println("Result:" + result3);
                    break;
                
                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                
                default:
                    System.out.println("Invalid choice! Please try again.");
            } // end of switch 
        } // end of while 
        
        sc.close();
        
    }
}
