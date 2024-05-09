package net.bteuk.network.lib.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.CompletableFuture;


public class InputSocket {

    private final int port;

    private ServerSocket serverSocket;

    public InputSocket(int port) {
        this.port = port;
    }

    public void start(SocketHandler handler) {
        CompletableFuture.runAsync(() -> {
            try {
                serverSocket = new ServerSocket(port);
                while (true)
                    new AbstractSocketHandler(serverSocket.accept(), handler).start();
            } catch (IOException ex) {
                //if (serverSocket == null) Proxy.getInstance().getLogger().warn("Could not bind port to socket!");
            }
        });
    }
}
