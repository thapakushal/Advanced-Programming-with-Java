
package socket_programming;

import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class FirstClient {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("127.0.0.1",8002);
            System.out.println("Connection Success..");

            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
            dout.writeInt(5);
            dout.flush();

            // Client Receives output
            DataInputStream din = new DataInputStream(socket.getInputStream());
            int response = din.readInt();
            System.out.println("Square is: "+response);

            // Multiple read write creates conflict so close 
            din.close();
            dout.close();
            socket.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
