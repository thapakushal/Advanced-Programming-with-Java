
package rmi_string_operations;

// business logics here in remote object 


import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

// this calsss must extend UnicastRemoteObject to become a remote object 
// it IMPLEMENTS the interface to provie actual implementation logic of methods 

public class strRemoteObject extends UnicastRemoteObject implements RemoteMethods{
    // constructor ( must throw remote exception) 
    // what but 
    public strRemoteObject() throws RemoteException{
        super(); // prepares obj. to be remote // but doesn't bind it yet (ready to be bound - happens in RMI Server) 
    }
    
    @Override
    public String toLower(String str1) throws RemoteException{
        if(str1 == null){
            return null;
        }
        return str1.toLowerCase();
    }
    
    @Override
    public String toUpper(String str2) throws RemoteException{
        if(str2 == null){
            return null;
        }
        return str2.toUpperCase();
    }

    @Override
    public String toPalindrome(String str3) throws RemoteException {
        if(str3 == null){
            return null;
        }
        
        String cleanText = str3.toLowerCase();
        String revText = new StringBuilder(cleanText).reverse().toString();
        
        if(cleanText.equals(revText)){
            System.out.println(str3 + "is a palindrome"); // Server logs this 
            return "\"" +str3 + "\" is a palindrome"; // client get response
        }
        else{
            System.out.println(str3 + "is not a palindrome"); // server log 
            return "\"" + str3 + "\" is NOT a Palindrome"; // response -> client 
        }
    }
    
    
}