// About Registry = A database/phonebook that stores remote objects 


package rmi_string_operations;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;

public class RmiServer {
    public static void main(String[] args) throws RemoteException{
        // Start RMI registry on port 8008
        // create registry 
        Registry registry = LocateRegistry.createRegistry(8008);
        
        // Create the instance of remote object 
        // obj contains actual business loic
        strRemoteObject cro = new strRemoteObject(); // constructor called here 
        
        // Bind the remote obj. to a name(using "skeleton or any name - cleint must use same name")
        registry.rebind("skeleton",cro);
        // cro - object 
        // rebind - this adds the entry to registry 
        // like saying : Store this obj(cro) in the registry with name "skeleton"
        
        System.out.println("Server is Running......");
    }
}
