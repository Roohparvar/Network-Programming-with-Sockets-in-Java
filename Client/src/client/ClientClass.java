package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientClass {

    Socket MySocket;
    int port = 8080;
    String MyServerAddres = "127.0.0.1";

    InputStream FromMyServer;
    OutputStream ToMyServer;

    DataInputStream MyReaderStream;
    PrintWriter MyWriterStream;

    public ClientClass() {
        try {
            MySocket = new Socket(this.MyServerAddres, this.port);
            System.out.println("Connected to the server");

            FromMyServer = MySocket.getInputStream();
            ToMyServer = MySocket.getOutputStream();

            MyReaderStream = new DataInputStream(FromMyServer);
            MyWriterStream = new PrintWriter(ToMyServer, true);

            String msg = MyReaderStream.readLine();
            System.out.println("Server:" + msg);

            MyWriterStream.println("Hello server, I'm good, thank you");
            System.out.println("client: Hello server, I'm good, thank you");
        } catch (IOException ex) {
            Logger.getLogger(ClientClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
