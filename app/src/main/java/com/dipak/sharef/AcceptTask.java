package com.dipak.sharef;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptTask extends AsyncTask<ServerSocket, Void, Void> {

    protected Socket doInBackground(ServerSocket server)
    {
        try
        {
            server = new ServerSocket(50000);
            System.out.println("Sender Socket Started");
            System.out.println("Waiting for Receiver to connect... ");
            Socket socket = server.accept();
            System.out.println("Client Accepted");

            return socket;
        }
        catch(IOException i)
        {
            System.out.println(i);
            Socket o = null;
            return o;
        }
    }

}
