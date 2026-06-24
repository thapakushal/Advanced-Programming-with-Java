
package rmi_string_operations;
import java.rmi.Remote;
import java.rmi.RemoteException;

// this interface defines what remote methods are available for client to call 
// every method must throw RemoteException (RMI requirement)

public interface RemoteMethods extends Remote{
    String toLower(String str1) throws RemoteException;
    String toUpper(String str2) throws RemoteException;
    String toPalindrome(String str3) throws RemoteException;
}

