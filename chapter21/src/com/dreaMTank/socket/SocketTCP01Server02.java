package com.dreaMTank.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 林
 * @versoin 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        byte[] buff = new byte[1024];
        int lend = 0;
        while ((lend = inputStream.read(buff)) != -1) {
            System.out.println(new String(buff,0, lend));
        }
        serverSocket.close();
        socket.close();
        inputStream.close();
    }
}
