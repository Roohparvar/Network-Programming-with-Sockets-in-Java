package server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerClass {

    int MyServerPortNumber = 8080;
    ServerSocket MyServerSocket;

    InputStream FromMyClient;
    OutputStream ToMyClient;

    DataInputStream MyReaderStream;
    PrintWriter MyWriterStream;

    public ServerClass() {

        try {
            MyServerSocket = new ServerSocket(this.MyServerPortNumber);
            System.out.println("Server started");

            Socket MyClient = MyServerSocket.accept();
            System.out.println("A new client has connected to the server");

            FromMyClient = MyClient.getInputStream();
            ToMyClient = MyClient.getOutputStream();

            MyReaderStream = new DataInputStream(FromMyClient);
            MyWriterStream = new PrintWriter(ToMyClient, true);

            MyWriterStream.println("Hello Client, how are you?");
            System.out.println("server: Hello Client, how are you?");

            String msg = MyReaderStream.readLine();
            System.out.println("Client:" + msg);

        } catch (IOException ex) {
            Logger.getLogger(ServerClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
