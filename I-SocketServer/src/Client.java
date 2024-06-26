import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args){
        if (args.length < 2) {
            System.out.println("Usage: java Client <server name> <port number>");
            return;
        }
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);

        try{
            System.out.println("Connecting to " + serverName + " On port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just Connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("Server says " + in.readUTF());
            client.close();
        }catch(IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }



}
