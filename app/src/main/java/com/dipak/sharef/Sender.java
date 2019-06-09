package com.dipak.sharef;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sender {

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public Sender(int port)
    {
        //need to insertasync task
        //socket = AcceptTask(server);

        DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String line = " ";

        while(!line.equals("Over"))
        {
            try
            {
                line = in.readUTF();
                System.out.println(line);
            }
            catch(IOException i)
            {
                System.out.println("Error");
                System.out.println( i);
            }
        }
        System.out.println("Closing Sender");
        socket.close();
        in.close();
    }

}
