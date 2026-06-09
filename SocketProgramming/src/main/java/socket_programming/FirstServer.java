package socket_programming;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FirstServer {
    public static void main(String[] args) throws IOException{
        // Locate using serverSocket 
        ServerSocket ss = new ServerSocket(8002); // On Local Host 8002 
        System.out.println("Server Running at 8002 Port");
        Socket socket = ss.accept();
        System.out.println("Connection Established..");
        
        DataInputStream din = new DataInputStream(socket.getInputStream());
        int num = din.readInt();
        num = num*num;
        
        // Return data to client after this 
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        dout.writeInt(num);
        
        dout.close();
        din.close();
        socket.close();
        ss.close(); // Port Release 
    }
}
